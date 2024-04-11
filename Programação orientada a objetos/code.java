// PROGRAMAÇÃO ORIENTADA A OBJETOS

// O QUE EU VOU SABER FAZER
/*
    Reconhecimento o paradigma da programação computactional;
    ter discernimento de classes e objetos e saber caracterizar também;
    Compreender de que forma os objetos conversam entre si pra
    Solucionar problemas;
    Organizar um ambiente de desenvolvimento que permita, o uso
    de linguagens de programação computacional orientada a objetos;
*/

// PLANO DE ESTUDOS
/*
    o contexto histórico;
    as ferramentas e download;
    classes e objetos
*/

// CONTEXTO HISTÓRICO & POO DITA EM OUTRAS PALAVRAS
 /*
    Segundo alguns dados de 2012, o conceito de programação orientada a objetos
    estão ligadas, com os trabalhos feitos de Ole-Johan Dahl e Kristen Nygaard
    no projeto da linguagem SIMULA, startado no Centro de Computação Norueguês 
    em 1961. essa linguagem de programação deu início a noção de classes, 
    instâncias, subclasses, métodos virtuais e de subrotinas, como partes
    de um paradigma explícito da programação, além de já usar o conceito
    de garbage collection.

    Dentro do universo dos recicláveis, usamos coisas do lixo, para
    reutilização dentro dos códigos, facilitando a manutenção e outros..

    Logo a programação orientada a objetos trata de "reciclar o código"
    escrevendo menos e tornando um sistema cheio de gambiarras e
    muito código, virar uma coisa simples que pode ser re-utilizada
    sendo o termo "garbage collection ou coleta de lixo";
*/

// LINGUAGENS DE PROGRAMAÇÃO POO
/*
    Python,
    C#,
    C++,
    Objective C,
    Java,
    SmallTalk;
    [e outras mais]
*/

// HISTÓRIA DA LINGUAGEM JAVA
/*
    Java é uma linguagem poo, desenvolvida
    nos anos 90 por uma equipe de programadores
    liderada por James pela empresa Sun Microsystems
    que emm 2008 foi comprado pela atual oracle.
*/

// FERRAMENTAS DE DESENVOLVIMENTO DO JAVA & COMO INSTALAMOS EM NOSSO COMPUTADOR
/*
    para poder dar início a programação em java, precisamos do jdk ou
    kit de desenvolvimento para java.
    e do jre, para conseguir rodar a aplicação numa vm.
    também precisamos do Java SE Development Kit 8
    nessa plataforma da oracle precisa escolher
    as ferramentas que sejam compatíveis com o seu sistema.
    em seguida precisamos de um editor de texto qualquer 
    [usar vscode mesmo].
    criamos um projeto
    tendo o projeto feito, podemos escrever em java.
*/

// O QUE É A POO?
/*
   um paradigma ou um método que os desenvolvedores e programadores usam
   para reciclar todo o código, agilizando o serviço, realizando menos
   manutenção, promovendo confiabilidade e segurança e facilitação
   no momento de reparo do sistema. 
*/

// O QUE SÃO CLASSES?
/*
   podemos ter uma visão mais ampla disso escrevendo um código
   java: 
*/
   public class Pessoa{
        int cpf;
        String sexo;
        void imprimirNome(){
            System.out.println("nome : "+nome);
        }
        boolean validarCPF(int cpf){
            boolean retorno = false;
            if(cpf != 0)
                retorno = true;
            else
                retorno = false;
            return retorno;
        }
   } 
/*
        essas classes são como objetos onde, define-se o cpf retornando como um
        número inteiro, e uma string como o sexo da pessoa; 
        sendo assim usa-se o void, o void atua como uma function mas
        com o outro nome, essa function que imprime o nome, vai imprimir 
        dentro da linha do sistema o nome, retornando o valor da variável nome.
        veja que nesse mesmo objeto / function, também temos uma validação
        feita com condicionais if que verificam se aquele cpf que foi
        definido existe ou não.
*/
    public class Pessoa{ // as classes no css atuam para nos facilitar com quanto a forma como mudamos, a aparência de algo;
        int cpf; // aqui vai sair o cpf da pessoa em formato de números inteiros;
        String sexo; // aqui vai sair o sexo da pessoa em formato de string;
        void imprimirNome(){ // aqui uma function com outros nomes, vai imprimir o nome da pessoa
                             // usando system.out.println concatenando o nome + o valor da variável nome;
            System.out.println("nome : "+nome);
        }
        boolean validarCPF(int cpf){ // aqui vai ter uma validação feita usando métodos booleanos, que vai verificar
                                     // se o cpf que retorna como um int é aquilo mesmo, se ele for 
                                     // diferente de zero o sistema valida se não for diferente, ele não valida
                                     // logo o cpf da pessoa não é válido;
            boolean retorno = false;
            if(cpf != 0)
                retorno = true;
            else
                retorno = false;
            return retorno;
        }
   }
/*
    as classes dentro do css atuam como um meio de um desenvolvedor ou programador, definir uma tipo de 
    aparência a determinado elemento de forma que sua aparência é aplicada individualmente;
    as classes dentro do java são diferentes, elas vão dizer como vai ser o nome daquele objeto;
*/

