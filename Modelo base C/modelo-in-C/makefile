#//-----------------------MAKEFILE --------------------\\
# AUTHOR - SIDNEY JUNIOR 								#
# GITHUB - github.com/sidjr2							#
# CONTACT - sidney.fejr@gmail.com    					#
# CREATE - 05/06/2021									#
# VERSION - BETA										#
# COMENTARIO - ESSE DIRETORIO PODE SER USADO DE BASE    #
#              EM QUASE TODOS OS PROGRAMAS QUE USAM     #
#			   A LINGAGUEM C E USAM O GCC PARA COMPILAR #
#              FAÇA BOM USO, SEMPRE USANDO REFERENCIA   #
#//-----------------------------------------------------\\

NAME = nome_do_projeto
NAME_APP = nome_do_programa
PROGRAMA = ./apps
BIN = ./bin
INCLUDE = ./include
OBJ = ./obj
SRC = ./src
LIB = ./lib

FLAGS = -o3 -Wall -lm

all: $(NAME) $(NAME_APP)

$(NAME): \
    $(OBJ)/menu.o 
	@echo "-- CRIANDO BIBLIOTECA DO PROJETO --"
	ar -rcs $(LIB)/$(NAME).a $(OBJ)/*.o

$(NAME_APP): clean_programa \
	$(BIN)/main

$(OBJ)/%.o: $(SRC)/%.c $(INCLUDE)/%.h
	@echo "-- COMPILANDO BIBLIOTECA --"
	gcc $(FLAGS) -c $< -I $(INCLUDE) -o $@

$(BIN)/%: $(PROGRAMA)/%.c
	@echo "-- COMPILANDO VERSAO EXECUTAVEL --"
	gcc $(FLAGS) $< $(LIB)/$(NAME).a -I $(INCLUDE) -o $@ 

run:
	@echo "-- COMPILACAO FINAL EM ANDAMENTO --"
	$(BIN)/main

clean:
	@echo "-- LIMPANDO ARQUIVOS COMPILADO --"
	rm -rf $(BIN)/* $(LIB)/* $(OBJ)/*

clean_programa:
	@echo "LIMPANDO DIRETORIO BIN"
	rm -rf $(BIN)/*