CC = gcc
CFLAGS = -g -Wall
CLIBS = -lm
OBJS = arquivos.o propriedade.o
TARGET = hipercampo
all: $(TARGET)

hipercampo: $(OBJS)
	$(CC) $(CFLAGS) $(OBJS) -o hipercampo main.c $(CLIBS)

arquivos.o: arquivos.c arquivos.h
	$(CC) $(CFLAGS) -c arquivos.c $(CLIBS)

plano.o: propriedade.c propriedade.h
	$(CC) $(CFLAGS) -c plano.c $(CLIBS)

clean:
	rm -rf $(OBJS) hipercampo