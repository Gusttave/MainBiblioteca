import   java.util.Scanner ;
public   class   MainBiblioteca {   
public   static   void   main ( String [] args ) {

        Scanner leia =   novo   Scanner ( Sistema . In );
        Cadastro b1 =  novo  Cadastro ();
        Frete b2 =  novo  Frete ();

// VARIAVEIS
        valor duplo =  0 ;
        float opcao;
        
        frete duplo =  0 ;
        resultado duplo ;
        int n =   11 ; // tamanho do vetor
        int v [] =   novo   int [n]; // declaração e alocação de espaço para o vetor "v"
        int i; // índice ou posição

 
// processando os "n" elementos do vetor "v"
        para (i =  0 ; i < n; i ++ ) {
        v [i] = i; // na i-ésima posição do vetor "v" armazena o valor da variável "i"
        }

        // Bem-Vindo
        Sistema . para fora . println ( " >> Livraria Online << " );
        Sistema . para fora . println ( " ======================== " );
        Sistema . para fora . println ( " ► APROVEITE e compre acima de 150 reais em produtos e ganhe 10% de desconto ◄ " );
        Sistema . para fora . println ( " ======================== " );
        Sistema . para fora . println ( " Para efetuar uma ou mais compras, cadastre-se em nosso site " );
        
        // CADASTRO
        Sistema . para fora . println ( " >> CADASTRO << " );
        Sistema . para fora . println ( " =============================== " );

        Sistema . para fora . println ( " Nome: " );
        b1 . setNome (leia . nextLine ());

        Sistema . para fora . println ( " CPF: " );
        b1 . setCpf (leia . nextLine ());

        Sistema . para fora . println ( " Estado: " );
        b2 . setEstado (leia . nextLine ());

        Sistema . para fora . println ( " Telefone: " );
        b1 . setNome (leia . nextLine ());

        Sistema . para fora . println ( " Cadastro efetuado com sucesso, efetue o login e prossiga á suas compras. " );
        Sistema . para fora . println ( " ======================== " );
                  
        // PRODUTOS
        Sistema . para fora . println ( " LISTA DE LIVROS " );
        Sistema . para fora . println ( " ======================== " );
        
        // AVISO
        Sistema . para fora . println ( " ▶ ATENÇÃO ◀ " );
        Sistema . para fora . println ( " CASO QUEIRA UM DETERMINADO PRODUTO, DIGITE A LETRA CORRESPONDENTE AO PRODUTO, CASO NÃO QUEIRA UM OU MAIS PRODUTOS, DIGITE 'NÃO' E CLIQUE ENTER " );
        Sistema . para fora . println ( " •••••••••••••••••••• " );
        
        // PRODUTO A
        Sistema . para fora . println ( " A - LIVRO: A Culpa é das Estrelas - 30 $: " );
        opcao = leia . próximo () . charAt ( 0 );

     if (opcao ==  ' a ' ) {
          valor = valor +  30 ;

    } else   System . para fora . println ( " Veja os livros populares! " );
                
        // PRODUTO B        
        Sistema . para fora . println ( " B - LIVRO: Guerra e Paz - 50 $: " );
        opcao = leia . próximo () . charAt ( 0 );

     if (opcao ==   ' b ' ) {
          valor = valor +  50 ;

    } else   System . para fora . println ( " Veja os livros populares! " );
                
        // PRODUTO C        
        Sistema . para fora . println ( " C - LIVRO: Em busca do tempo perdido - 35 $: " );
        opcao = leia . próximo () . charAt ( 0 );

     if (opcao ==   ' c ' ) {
         valor = valor +  35 ;

    } else   System . para fora . println ( " Veja os livros populares! " );
                
        // PRODUTO D        
        Sistema . para fora . println ( " D - LIVRO: Inteligência Emocional - 50 $: " );
        opcao = leia . próximo () . charAt ( 0 );

     if (opcao ==   ' d ' ) {
         valor = valor +  50 ;

    } else  System . para fora . println ( " Veja os livros populares! " );
                
        // PRODUTO E        
        Sistema . para fora . println ( " E - LIVRO: Harry Potter (Contém a saga toda, 7 livros.) - 150 $: " );
        opcao = leia . próximo () . charAt ( 0 );

     if (opcao ==   ' e ' ) {
         valor = valor +  150 ;

    } else   System . para fora . println ( " Veja os livros populares! " );
                
         // PRODUTO F       
         Sistema . para fora . println ( " F - LIVRO: Ulisses - 45 $: " );
         opcao = leia . próximo () . charAt ( 0 );

     if (opcao ==   ' f ' ) {
         valor = valor +  45 ;
    } else   System . para fora . println ( " Veja os livros populares! " );

         // PRODUTO G       
         Sistema . para fora . println ( " G - LIVRO: O nome do vento - 60 $: " );
         opcao = leia . próximo () . charAt ( 0 );

     if (opcao ==   ' g ' ) {
         valor = valor +  60 ;
    } else  System . para fora . println ( " Veja os livros populares! " );  

        // PRODUTO H        
        Sistema . para fora . println ( " H - LIVRO: A montanha mágica - 20 $: " );
        opcao = leia . próximo () . charAt ( 0 );

     if (opcao ==   ' h ' ) {
         valor = valor +  20 ;

    } else   System . para fora . println ( " Veja os livros populares! " );

        // PRODUTO I      
        Sistema . para fora . println ( " I - LIVRO: A menina que rouvava livros - 65 $: " );
        opcao = leia . próximo () . charAt ( 0 );

     if (opcao ==   ' i ' ) {
         valor = valor +  65 ;

    } else   System . para fora . println ( " Veja os livros populares! " );

      // PRODUTO J
      Sistema . para fora . println ( " J - LIVRO: O Castelo - 55 $: " );
      opcao = leia . próximo () . charAt ( 0 );

     if (opcao ==   ' j ' ) {
         valor = valor +  55 ;
    } else   System . para fora . println ( " Veja os livros populares! " );

       // ´PRODUTO K
       Sistema . para fora . println ( " K - LIVRO: Hamlet - 15 $: " );
       opcao = leia . próximo () . charAt ( 0 );

     if (opcao ==   ' k ' ) {
         valor = valor +  15 ;
    } else   System . para fora . println ( " Veja os livros populares! " );

     // VALORES / VALOR A PAGAR
     Sistema . para fora . println ( " O valor total em $ foi: "  + valor);
     Sistema . para fora . println ( " ---------------------- " );
     Sistema . para fora . println ( " Informe seu Estado para calcular o frete: " );
     Sistema . para fora . println ( " A - RS - GRATIS $ \ n B - SC - 50 $ \ n C - PR - 100 $ \ n D - OUTROS - 50 $ \ n  " );  
     opcao = leia . próximo () . charAt ( 0 );
      
      if (opcao ==  ' a ' ) {
      frete =   15 ;
            
}
      if (opcao ==  ' b ' ) {
      frete =  25 ;  
}
      if (opcao ==  ' c ' ) {
      frete =  50 ;

      }
      if (opcao ==  ' d ' ) {
      frete =  65 ;
      }

      resultado = frete + valor;
      Sistema . para fora . println ( " VALOR TOTAL: "   + resultado);
      
      if (valor > =  150 ) {
        Sistema . para fora . println ( " Você tem 10% de desconto nesta compra. " );
        Sistema . para fora . println ( " ============================================= " );
      resultado = (resultado *   0,90 );
      Sistema . para fora . println ( " Valor a pagar com 10% de desconto é de: "  + resultado);
      }
      // FORMA DE PAGAMENTO
      Sistema . para fora . println ( " Informe a forma de pagamento: " );
      Sistema . para fora . println ( " 1 - CARTÃO \ n 2 - BOLETO / AVISTA " );
      opcao = leia . próximo () . charAt ( 0 );

      if (opcao ==   ' 2 ' ) {
        Sistema . para fora . println ( " O valor á ser pago no boleto avista é de: "  + resultado);    
        Sistema . para fora . println ( " Clique em imprimir e efetue o pagamento do boleto na Agência ou Loterica mais próxima " );    
      
      } else   if (opcao ==   ' 1 ' ) {     
        Sistema . para fora . println ( " Prossiga com seu pagamento. " );
        Sistema . para fora . println ( " PARCELAMENTO: " );
        Sistema . para fora . println ( " Insira o número de parcelas: " );
        Sistema . para fora . println ( " A - 3x \ n B - 5x \ n C - 8x \ n D - 12x \ n  " );
        Sistema . para fora . println ( " Digite aqui: " );
        b2 . setParcelas (leia . nextInt ());
      
      if (b2 . getParcelas () ==  3 ) {
      resultado = (resultado /  3 );
      Sistema . para fora . println ( " Ficou 3 vezes de: "  + resultado);
      }  

      else   if (b2 . getParcelas () ==  5 ) {
      resultado = (resultado /  5 );
      Sistema . para fora . println ( " Ficou 5 vezes de: "  + resultado);
}
      else   if (b2 . getParcelas () ==  8 ) {
      resultado = (resultado /  8 );
      Sistema . para fora . println ( " Ficou 8 vezes de: "  + resultado);
}
      else   if (b2 . getParcelas () ==  12 ) {
      resultado = (resultado /  12 );
      Sistema . para fora . println ( " Ficou 12 vezes de: "  + resultado);

        }
      } 
   }
}