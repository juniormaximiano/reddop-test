const inputTitulo = document.getElementById('inputTitulo');
const inputDescricao = document.getElementById('inputDescricao');
const inputData = document.getElementById('inputData');
const lista = document.getElementById('listaTarefas');

let tarefas = JSON.parse(localStorage.getItem('tarefas')) || [];

function salvar() {
    localStorage.setItem('tarefas', JSON.stringify(tarefas));
}

function render() {
    lista.innerHTML = '';

    tarefas
        .sort((a, b) => new Date(b.dataVencimento) - new Date(a.dataVencimento))
        .forEach(tarefa => {

            const li = document.createElement('li');

            if (tarefa.status === "Pendente") {
                li.classList.add('pendente');
            } else if (tarefa.status === "Em Andamento") {
                li.classList.add('andamento');
            } else if (tarefa.status === "Concluída") {
                li.classList.add('concluida');
            }

            const select = document.createElement('select');

            ['Pendente', 'Em Andamento', 'Concluída'].forEach(status => {
                const option = document.createElement('option');
                option.value = status;
                option.textContent = status;

                if (tarefa.status === status) {
                    option.selected = true;
                }

                select.appendChild(option);
            });

            select.onchange = () => {
                tarefa.status = select.value;
                salvar();
                render();
            };

            li.innerHTML = `
                <strong>${tarefa.titulo}</strong>
                <span>${tarefa.descricao}</span>
                <small>${tarefa.dataVencimento}</small>
            `;

            li.appendChild(select);

            lista.appendChild(li);
        });
}

function adicionar() {
    const titulo = inputTitulo.value.trim();
    const descricao = inputDescricao.value.trim();
    const data = inputData.value;

    if (!titulo || !descricao || !data) {
        alert('Preencha todos os campos!');
        return;
    }

    const tarefa = {
        id: Date.now(),
        titulo,
        descricao,
        dataVencimento: data,
        status: "Pendente"
    };

    tarefas.push(tarefa);

    salvar();
    render();

    inputTitulo.value = '';
    inputDescricao.value = '';
    inputData.value = '';
}

render();