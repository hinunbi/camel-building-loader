# camel-building-loader
Apache Camel을 이용한 도로명주소 파일 다운로드 통합

## 1. Package this project

    mvn clean package

## 2. Run this project with Camel maven plugin or

    mvn clean camel:run

## 3. Run this project with Spring boot maven plugin

    mvn clean spring-boot:run

## 4. Copy the building information files and save it to the DBMS

	camel-building-etl$ cp ../camel-building-loader/target/juso/all-unzipped/build_busan.txt target/juso/etl
