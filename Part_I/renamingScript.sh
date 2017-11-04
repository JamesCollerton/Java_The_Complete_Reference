currentDir=$1;
topDir=$(PWD);

cd $currentDir;

echo ""
echo "$currentDir";
echo "$topDir";

rm *.class

for file in *.java;
do

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

cd $topDir
