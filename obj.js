et estudantes = [
  { nome: "Ana", idade: 17, turma: "2A" },
  { nome: "Bruno", idade: 16, turma: "2B" },
  { nome: "Clara", idade: 18, turma: "3A" }
];

console.log("Primeiro estudante:", estudantes[0].nome);
console.log("Idade do segundo estudante:", estudantes[1].idade);
console.log("Turma do terceiro estudante:", estudantes[2].turma);

// Adicionando nova propriedade ao primeiro estudante
estudantes[0].nota = 9.5;

// Mostrando todos os dados do primeiro estudante após alteração
console.log(estudantes[0]);