install:
	./gradlew clean install

run:
	./app/build/install/app/bin/app

check-updates:
	gradle dependencyUpdates

lint:
	./gradlew checkstyleMain

build:
	gradle build

