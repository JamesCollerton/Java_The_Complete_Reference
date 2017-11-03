rm *.class

for file in *.java;
do
	echo ""

	echo "Changing $file file";
	
	fileNoJava="${file%.*}";

	echo "Removed .java to get $fileNoJava";

	fileNoUnderscore=$(sed s/_// <<< $fileNoJava);

	echo "Removed _ to get $fileNoUnderscore";

	# Change filename
	mv $file $fileNoUnderscore.java

	# Change contents		
	sed -i ''  s/$fileNoJava/$fileNoUnderscore/g $file
done;
