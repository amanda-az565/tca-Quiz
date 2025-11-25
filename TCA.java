import java.util.Scanner;

public class TCA{

    public final static Scanner TECLADO = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static double lerValorReal() {
        return TECLADO.nextDouble();
    }

    public static int lerValorInteiro() {
        return TECLADO.nextInt();
    }

    public static String lerPalavra() {
        return TECLADO.next();
    }

    public static double calcularNota(int[] gabarito, int[] respostasUsuario) {
        int acertos = 0;

        for (int i = 0; i < gabarito.length; i++) {
            if (respostasUsuario[i] == gabarito[i]) {
                acertos++;
            }
        }

        double nota = (acertos / (double) gabarito.length) * 10.0;
        imprimir("Você acertou " + acertos + " questões de " + gabarito.length );
        return nota;
    }

    public static void main(String[] args) {

        String[][] biologia = {
            {
                "A) Qual é a principal função das mitocôndrias nas células eucarióticas?",
                "1) Armazenar material genético",
                "2) Produzir energia na forma de ATP",
                "3) Controlar as atividades celulares",
                "4) Produzir proteínas"
            },
            {
                "B) Qual a diferença entre reprodução sexuada e assexuada?",
                "1) A sexuada envolve apenas um organismo; a assexuada, dois",
                "2) A sexuada ocorre apenas em plantas",
                "3) A sexuada envolve dois organismos e troca de material genético; a assexuada ocorre sem troca de material genético",
                "4) A assexuada é exclusiva de animais"
            },
            {
                "C) O que é DNA e qual é o seu papel na hereditariedade?",
                "1) É uma molécula responsável pela digestão de alimentos",
                "2) É um tipo de proteína que fornece energia para a célula",
                "3) É o material genético que armazena e transmite informações hereditárias",
                "4) É um lipídio que protege o núcleo celular"
            },
            {
                "D) Como ocorre o processo de fotossíntese nas plantas?",
                "1) As plantas absorvem oxigênio e liberam dióxido de carbono",
                "2) As plantas utilizam luz solar, água e dióxido de carbono para produzir glicose e oxigênio",
                "3) As plantas produzem energia a partir da digestão de matéria orgânica",
                "4) As plantas convertem oxigênio em glicose"
            },
            {
                "E) O que são ecossistemas e como os seres vivos interagem dentro deles?",
                "1) Conjuntos de seres vivos isolados sem relação entre si",
                "2) Apenas comunidades de animais",
                "3) Conjuntos de seres vivos e fatores não vivos que interagem em um ambiente",
                "4) Locais onde não há interações biológicas"
            }
        };

        String[][] portugues = {
            {
                "A) Qual das opções apresenta uma palavra com erro de ortografia?",
                "1) Exceção",
                "2) Ansioso",
                "3) Enxergar",
                "4) Enchergar"
            },
            {
                "B) Em qual das frases o sujeito está indeterminado?",
                "1) Estudamos muito para a prova.",
                "2) Fizeram a tarefa rapidamente.",
                "3) O aluno respondeu à professora.",
                "4) Maria e João foram ao cinema."
            },
            {
                "C) Qual é o antônimo da palavra “feliz”?",
                "1) Alegre",
                "2) Contente",
                "3) Triste",
                "4) Satisfeito"
            },
            {
                "D) Em “O cachorro correu atrás da bola”, qual é a função sintática de “atrás da bola”?",
                "1) Sujeito",
                "2) Predicado",
                "3) Objeto direto",
                "4) Adjunto adverbial de lugar"
            },
            {
                "E) Em qual alternativa há um erro de concordância verbal?",
                "1) Os alunos estudam muito.",
                "2) As flores do jardim murcharam.",
                "3) A gente fomos ao cinema.",
                "4) Eles chegaram cedo."
            }
        };

        String[][] geografia = {
            {
                "A) Qual é o maior continente do mundo em área?",
                "1) África",
                "2) América do Norte",
                "3) Ásia",
                "4) Europa"
            },
            {
                "B) Qual rio é considerado o mais longo do mundo?",
                "1) Amazonas",
                "2) Nilo",
                "3) Yangtzé",
                "4) Mississipi"
            },
            {
                "C) Qual é o país com maior população do mundo?",
                "1) Índia",
                "2) Estados Unidos",
                "3) China",
                "4) Brasil"
            },
            {
                "D) Qual é o deserto mais seco do mundo?",
                "1) Saara",
                "2) Gobi",
                "3) Atacama",
                "4) Kalahari"
            },
            {
                "E) Qual é a capital do Canadá?",
                "1) Toronto",
                "2) Ottawa",
                "3) Vancouver",
                "4) Montreal"
            }
        };

        String[][] historia = {
            {
                "A) Em que ano ocorreu a Proclamação da República no Brasil?",
                "1) 1808",
                "2) 1822",
                "3) 1889",
                "4) 1922"
            },
            {
                "B) Quem foi o primeiro presidente do Brasil?",
                "1) Dom Pedro II",
                "2) Marechal Deodoro da Fonseca",
                "3) Getúlio Vargas",
                "4) Juscelino Kubitschek"
            },
            {
                "C) Qual evento marcou o início da Segunda Guerra Mundial?",
                "1) A Revolução Russa",
                "2) A invasão da Polônia pela Alemanha",
                "3) O ataque a Pearl Harbor",
                "4) O lançamento da bomba atômica"
            },
            {
                "D) Qual civilização antiga construiu as pirâmides de Gizé?",
                "1) Maias",
                "2) Romanos",
                "3) Egípcios",
                "4) Gregos"
            },
            {
                "E) Em que ano o Brasil declarou sua independência de Portugal?",
                "1) 1500",
                "2) 1600",
                "3) 1822",
                "4) 1888"
            }
        };

        String[][] espanhol = {
            {
                "A) Qual é o significado da palavra 'amigo' em português?",
                "1) Inimigo",
                "2) Irmão",
                "3) Amigo",
                "4) Colega de trabalho"
            },
            {
                "B) Como se diz 'livro' em espanhol?",
                "1) Libro",
                "2) Cuadro",
                "3) Papel",
                "4) Escritorio"
            },
            {
                "C) Qual destas palavras está escrita corretamente em espanhol?",
                "1) Holla",
                "2) Hola",
                "3) Ola",
                "4) Olla"
            },
            {
                "D) O verbo 'ser' no presente do indicativo para 'yo' é:",
                "1) Soy",
                "2) Eres",
                "3) Es",
                "4) Somos"
            },
            {
                "E) Qual dessas frases está correta em espanhol?",
                "1) Yo tengo un perro.",
                "2) Yo tiene un perro.",
                "3) Yo tener un perro.",
                "4) Yo teno un perro."
            }
        };
        String[][] pokemon = {
            {
                "A) Qual é o Pokémon inicial do tipo fogo da região de Kanto?",
                "1) Bulbasaur", 
                "2) Charmander", 
                "3) Squirtle", 
                "4) Pikachu"
            },

            {
                "B) Qual é o tipo do Pokémon giratina",
                "1) eletrico e terra", 
                "2) grama e veneno", 
                "3) fogo e água", 
                "4) fantasma e dragão",
            },

            {
                "C) Qual é o lider de ginasio que vc enfrenta 3 vezes em pokemon firered?",
                "1) ash", 
                "2) misti", 
                "3) brock", 
                "4) giovani",
            },

            {
                "D) Quem é conhecido como o Pokémon Lendário do Tempo?",
                "1) Dialga", 
                "2) Palkia", 
                "3) Giratina", 
                "4) Arceus"
            },

            {
                "E) Quantos pokemon existem até a geração atual?",
                "1) 347",
                "2) 234",
                "3) 151", 
                "4) 1025",
            }
        };
        
        String[][] Disney = {
            {
                "A)Qual é o mascote da Disney?",
                "1) pateta", 
                "2) Mickey Mouse", 
                "3) Ursinho Pooh", 
                "4) Pikachu"
            },

            {
                "B)Qual princesa da Disney tem um castelo inspirado no parque Magic Kingdom?",
                "1) Cinderela", 
                "2) Aurora", 
                "3) Branca de neve", 
                "4) Moana",
            },

            {
                "C)Qual foi o primeiro longa-metragem animado lançado pela Disney, e em que ano ele estreou?",
                "1) Branca de neve", 
                "2) Tiana", 
                "3) Merida", 
                "4) elsa",
            },

            {
                "D)Qual é a unica da Prrincesa da Disney de tem uma filha? e qual o seu nome?",
                "1) Ariel e o nome da sua filha é Ana bella ", 
                "2) Aurora e o nome da sua filha é Melody", 
                "3) Anna e o nome da sua filha é julia", 
                "4) Ariel e o nome da sua filha é Melody"
            },

            {
                "E) Qual foi o primeiro curta-metragem animado da história da Disney a usar o processo de “multiplane camera” completo, e quantas camadas de cenário ele utilizou na cena mais complexa?",
                "1)O primeiro curta-metragem da Disney a usar o processo completo da multiplane camera foi Mickey Mouse",
                "2) O primeiro curta-metragem da Disney a usar o processo completo da multiplane camera foi Os três porquinhos",
                "3) O primeiro curta-metragem da Disney a usar o processo completo da multiplane camera foi The Old Mill",
                "4) O primeiro curta-metragem da Disney a usar o processo completo da multiplane camera foi Branca de neve e os sete as anões "
            }
        };

        String[][] Anime = {
            {
                "A)Qual é o nome do protagonista de Naruto?",
                "1) Naruto  Shippuden", 
                "2) Naruto Uchiha", 
                "3) Naruto Uzumaki", 
                "4) Naruto Namikazi "
            },

            {
                "B)Em Dragon Ball Z, qual é a forma mais famosa que o Goku atinge pela primeira vez contra Freeza?",
                "1) Kaioken x10", 
                "2) Super Saiyajin 3", 
                "3) Super Saiyajin", 
                "4) Ultra Instinto",
            },

            {
                "C)Qual anime venceu o primeiro prêmio “Anime do Ano” do Crunchyroll Awards?",
                "1) Attack on Titan", 
                "2) Mob Psycho 100", 
                "3) Yuri!!! on Ice", 
                "4) Re:Zero",
            },

            {
                "D)Em Attack on Titan, qual é o nome completo do cientista que escreveu os cadernos sobre os Titãs?",
                "1)Zeke Jaeger", 
                "2) Grisha Yaeger", 
                "3) Erwin Smith", 
                "4) Tom Ksaver"
            },

            {
                "E) Qual foi o primeiro anime totalmente colorido?",
                "1)Astro Boy (1963)",
                "2)Hakujaden – A Lenda da Serpente Branca (1958)",
                "3) Kimba, o Leão Branco (1965)",
                "4) Sailor Moon (1992) "
            }
        };
        String[][] olimpíadas = {
            {
                "Em qual país nasceram os Jogos Olímpicos da Antiguidade?",
                "1) Itália", 
                "2) Egito", 
                "3) Grécia", 
                "4) China"
            },

            {
                "B)De quantos em quantos anos acontecem os Jogos Olímpicos",
                "1) A cada 4 anos", 
                "2) a cada 2 anos", 
                "3)a cada 7 anos", 
                "4) a 3 anos",
            },

            {
                "C)Qual foi a primeira mulher a ganhar uma medalha de ouro olímpica?",
                "1) Nadia Comăneci", 
                "2) Hélène de Pourtalès", 
                "3) Charlotte Cooper", 
                "4) Suzanne Lenglen",
            },

            {
                "D)Qual cidade é a única do mundo que já sediou os Jogos Olímpicos de Verão três vezes?",
                "1)Los Angeles", 
                "2) Londres", 
                "3) Tóquio", 
                "4) Alemanha"
            },

            {
                "E) Qual atleta é o maior medalhista olímpico de todos os tempos?",
                "1)Michael Phelps",
                "2)Larisa Latynina",
                "3) Simone Biles",
                "4) Simone Biles "
            }
        };


       
        int[] respostasBiologia = {2, 3, 3, 2, 3};
        int[] respostasPortugues = {4, 2, 3, 4, 3};
        int[] respostasGeografia = {3, 2, 3, 3, 2};
        int[] respostasHistoria = {3, 2, 2, 3, 3};
        int[] respostasEspanhol = {3, 1, 2, 1, 1};
        int[] respostasPokemon = {2, 4, 4, 1, 4};
        int[] respostasDisney = {2,1,1,4,3};
        int[] respostasAnime = {3,3,3,2,2};
        int[] respostasolimpíadas = {3,1,3,2,1};

        imprimir("Seja bem vindo, escolha o quiz que voce quer jogar:");
        imprimir("A - Biologia");
        imprimir("B - Português");
        imprimir("C - Geografia");
        imprimir("D - História");
        imprimir("E - Espanhol");
        imprimir("F - Pokémon");

        
        

        String escolha = lerPalavra();
        String escolhaDois = lerPalavra();

        String[][] quizSelecionado = null;
        int[] gabaritoSelecionado = null;

        switch (escolha) {
            case "A":
                quizSelecionado = biologia;
                gabaritoSelecionado = respostasBiologia;
                break;
            case "B":
                quizSelecionado = portugues;
                gabaritoSelecionado = respostasPortugues;
                break;
            case "C":
                quizSelecionado = geografia;
                gabaritoSelecionado = respostasGeografia;
                break;
            case "D":
                quizSelecionado = historia;
                gabaritoSelecionado = respostasHistoria;
                break;
            case "E":
                quizSelecionado = espanhol;
                gabaritoSelecionado = respostasEspanhol;
                break;
            case "F": quizSelecionado = pokemon;
             gabaritoSelecionado = respostasPokemon;
                break;

            default:
                imprimir("OPS... não existe essa opção");
                
        }

        int[] respostasUsuario = new int[5];

        imprimir("digite suas respostas");
        for (int i = 0; i < quizSelecionado.length; i++) {
            for (String linha : quizSelecionado[i]) {
                imprimir(linha);
            }
            imprimir("Sua resposta: ");
            respostasUsuario[i] = lerValorInteiro();
        }

        
        double nota = calcularNota(gabaritoSelecionado, respostasUsuario);
        imprimir("Sua nota foi: " + nota);
        

        if (nota > 8F) {

            imprimir("PARABÉNS! Você ganhou um quiz surpresa!");
            imprimir("Escolha um quiz e boa sorte!");
            imprimir("Q - Quizz Um");
            imprimir("Y - Quizz Dois");
            imprimir("P - Quizz Três");
        
            String escolhaSegunda = lerPalavra(); 
            String[][] quizSelecionadoStrings = null;
            int[] gabaritoSelecionadoA = null;
        
            switch (escolhaSegunda) {
                case "Q":
                    quizSelecionadoStrings = Disney;
                    gabaritoSelecionadoA = respostasDisney;
                    break;
                case "Y":
                    quizSelecionadoStrings = Anime;
                    gabaritoSelecionadoA = respostasAnime;
                    break;
                case "P":
                    quizSelecionadoStrings = olimpíadas;               
                    gabaritoSelecionadoA = respostasolimpíadas;  
                    break;
                default:
                    imprimir("OPS... não existe essa opção.");
                    return; 
            }
        
            int[] resposUsuario = new int[quizSelecionadoStrings.length];
        
            imprimir("Digite suas respostas:");
        
            for (int i = 0; i < quizSelecionadoStrings.length; i++) {
        
                for (String linha : quizSelecionadoStrings[i]) {
                    imprimir(linha);
                }
        
                imprimir("Resposta:");
                respostasUsuario[i] = lerValorInteiro();
            }
        
        } else {
            imprimir("OPS... esse quiz não existe.");
        }
        
        
    }
}