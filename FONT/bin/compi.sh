#!/bin/sh 

./Asl $1.asl -ast $1.dot -dot -noexec
dot -Tpdf -o $1.pdf $1.dot
