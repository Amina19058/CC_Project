all: Syntax/Normal/Test Syntax/Nameless/Test

clean:
	rm -rf Syntax/Normal
	rm -rf Syntax/Nameless

Syntax/Normal/Test: Syntax/Normal.cf
	bnfc --java Syntax/Normal.cf -p Syntax --makefile=Syntax/MakefileNormal
	make --makefile=Syntax/MakefileNormal

Syntax/Nameless/Test: Syntax/Nameless.cf
	bnfc --java Syntax/Nameless.cf -p Syntax --makefile=Syntax/MakefileNameless
	make --makefile=Syntax/MakefileNameless

.PHONY: all clean