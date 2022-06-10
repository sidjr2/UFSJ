#-----------------------MAKEFILE ---------------------#
# AUTHOR - SIDNEY JUNIOR 						      #
# GITHUB - github.com/sidjr2						  #
# CONTACT - sidney.fejr@aluno.ufsj.edu.br			  #
# CREATE - 01/10/2021								  #
#-----------------------------------------------------#
CC = gcc
NAME = GRAFO
NAME_APP = GRAFO_C
PROGRAMA = ./apps
BIN = ./bin
INCLUDE = ./include
OBJ = ./obj
SRC = ./src
LIB = ./lib

FLAGS = -g -o3 -Wall -lm

all: $(NAME) $(NAME_APP)

$(NAME): \
    $(OBJ)/GRAFO.o
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