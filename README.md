# Assignment 01: Reading/Writing objects to and from XML and JSON


## File XML People

```xml
<people>
    <person id="1">
        <firstname>George R. R.</firstname>
        <lastname>Martin</lastname>
        <birthdate>1984-09-20T18:00:00.000+02:00</birthdate>
        <healthprofile>
            <lastupdate>2014-09-20T18:00:00.000+02:00</lastupdate>
            <weight>100</weight>
            <height>1.70</height>
            <bmi>31.14</bmi>
        </healthprofile>
    </person>
    <!-- add more people to the db -->
    <person id="2">
        <firstname>Paul</firstname>
        <lastname>Boga</lastname>
        <birthdate>1899-10-20T18:00:00.000+02:00</birthdate>
        <healthprofile>
            <lastupdate>2015-02-27T18:00:00.000+02:00</lastupdate>
            <weight>70</weight>
            <height>1.70</height>
            <bmi>31.14</bmi>
        </healthprofile>
    </person>
	<person id="3">
		<firstname>Pallo</firstname>
		<lastname>Pinco</lastname>
		<birthdate>1984-09-20T18:00:00.000+02:00</birthdate>
		<healthprofile>
			<lastupdate>2014-09-20T18:00:00.000+02:00</lastupdate>
			<weight>85</weight>
			<height>1.72</height>
			<bmi>28.9007571660357</bmi>
		</healthprofile>
	</person>
	<person id="4">
		<firstname>John</firstname>
		<lastname>Doe</lastname>
		<birthdate>1984-09-20T18:00:00.000+02:00</birthdate>
		<healthprofile>
			<lastupdate>2014-09-20T18:00:00.000+02:00</lastupdate>
			<weight>92</weight>
			<height>1.72</height>
			<bmi>22.985397512168742</bmi>
		</healthprofile>
	</person>
	<person id="5">
		<firstname>Alessia</firstname>
		<lastname>Sanchez</lastname>
		<birthdate>2013-05-13T18:00:00.000+02:00</birthdate>
		<healthprofile>
			<lastupdate>2014-01-20T18:00:00.000+02:00</lastupdate>
			<weight>20</weight>
			<height>1.00</height>
			<bmi>32.20</bmi>
		</healthprofile>
	</person>
	<person id="6">
		<firstname>Anthony</firstname>
		<lastname>Sanchez</lastname>
		<birthdate>1989-07-13T18:00:00.000+02:00</birthdate>
		<healthprofile>
			<lastupdate>2013-02-20T18:00:00.000+02:00</lastupdate>
			<weight>65</weight>
			<height>1.70</height>
			<bmi>28.9007571660357</bmi>
		</healthprofile>
	</person>
	<person id="7">
		<firstname>Jonathan</firstname>
		<lastname>Gonzalez</lastname>
		<birthdate>1990-10-31T18:00:00.000+02:00</birthdate>
		<healthprofile>
			<lastupdate>2014-09-10T18:00:00.000+02:00</lastupdate>
			<weight>80</weight>
			<height>1.86</height>
			<bmi>28.9007571660357</bmi>
		</healthprofile>
	</person>
	<person id="8">
		<firstname>Carmen</firstname>
		<lastname>Quispe</lastname>
		<birthdate>1965-07-15T18:00:00.000+02:00</birthdate>
		<healthprofile>
			<lastupdate>2012-09-20T18:00:00.000+02:00</lastupdate>
			<weight>73</weight>
			<height>1.69</height>
			<bmi>22.985397512168742</bmi>
		</healthprofile>
	</person>
	<person id="9">
		<firstname>Yoselyn</firstname>
		<lastname>Ruiz</lastname>
		<birthdate>1991-12-26T18:00:00.000+02:00</birthdate>
		<healthprofile>
			<lastupdate>2014-10-20T18:00:00.000+02:00</lastupdate>
			<weight>55</weight>
			<height>1.84</height>
			<bmi>31.14</bmi>
		</healthprofile>
	</person>
	<person id="10">
		<firstname>Pilar</firstname>
		<lastname>Sanchez</lastname>
		<birthdate>1960-05-20T18:00:00.000+02:00</birthdate>
		<healthprofile>
			<lastupdate>2014-09-12T18:00:00.000+02:00</lastupdate>
			<weight>83</weight>
			<height>1.81</height>
			<bmi>28.9007571660357</bmi>
		</healthprofile>
	</person>
	<person id="11">
		<firstname>Juan</firstname>
		<lastname>Gomez</lastname>
		<birthdate>1963-03-26T18:00:00.000+02:00</birthdate>
		<healthprofile>
			<lastupdate>2014-04-20T18:00:00.000+02:00</lastupdate>
			<weight>75</weight>
			<height>1.79</height>
			<bmi>28.9007571660357</bmi>
		</healthprofile>
	</person>
	<person id="12">
		<firstname>Melanie</firstname>
		<lastname>Escalante</lastname>
		<birthdate>1995-09-19T18:00:00.000+02:00</birthdate>
		<healthprofile>
			<lastupdate>2014-02-05T18:00:00.000+02:00</lastupdate>
			<weight>82</weight>
			<height>1.82</height>
			<bmi>22.985397512168742</bmi>
		</healthprofile>
	</person>
	<person id="13">
		<firstname>Enrique</firstname>
		<lastname>Palacios</lastname>
		<birthdate>1992-03-21T18:00:00.000+02:00</birthdate>
		<healthprofile>
			<lastupdate>2014-10-01T18:00:00.000+02:00</lastupdate>
			<weight>68</weight>
			<height>1.78</height>
			<bmi>32.20</bmi>
		</healthprofile>
	</person>
	<person id="14">
		<firstname>Stefano</firstname>
		<lastname>Pernat</lastname>
		<birthdate>1989-10-23T18:00:00.000+02:00</birthdate>
		<healthprofile>
			<lastupdate>2013-01-25T18:00:00.000+02:00</lastupdate>
			<weight>60</weight>
			<height>1.73</height>
			<bmi>28.9007571660357</bmi>
		</healthprofile>
	</person>
	<person id="15">
		<firstname>Nicola</firstname>
		<lastname>Pelizzari</lastname>
		<birthdate>1979-09-21T18:00:00.000+02:00</birthdate>
		<healthprofile>
			<lastupdate>2014-01-10T18:00:00.000+02:00</lastupdate>
			<weight>82</weight>
			<height>1.88</height>
			<bmi>28.9007571660357</bmi>
		</healthprofile>
	</person>
	<person id="16">
		<firstname>Emikaa</firstname>
		<lastname>Gianpiccolo</lastname>
		<birthdate>1991-09-27T18:00:00.000+02:00</birthdate>
		<healthprofile>
			<lastupdate>2013-12-11T18:00:00.000+02:00</lastupdate>
			<weight>70</weight>
			<height>1.72</height>
			<bmi>22.985397512168742</bmi>
		</healthprofile>
	</person>
	<person id="17">
		<firstname>Guido</firstname>
		<lastname>Pugliese</lastname>
		<birthdate>1988-11-30T18:00:00.000+02:00</birthdate>
		<healthprofile>
			<lastupdate>2014-10-23T18:00:00.000+02:00</lastupdate>
			<weight>85</weight>
			<height>1.71</height>
			<bmi>31.14</bmi>
		</healthprofile>
	</person>
	<person id="18">
		<firstname>Fabio</firstname>
		<lastname>Sarpa</lastname>
		<birthdate>1986-05-21T18:00:00.000+02:00</birthdate>
		<healthprofile>
			<lastupdate>2014-08-21T18:00:00.000+02:00</lastupdate>
			<weight>85</weight>
			<height>1.89</height>
			<bmi>28.9007571660357</bmi>
		</healthprofile>
	</person>
	<person id="19">
		<firstname>Jorge</firstname>
		<lastname>Ventura</lastname>
		<birthdate>1985-01-04T18:00:00.000+02:00</birthdate>
		<healthprofile>
			<lastupdate>2014-10-07T18:00:00.000+02:00</lastupdate>
			<weight>82</weight>
			<height>1.89</height>
			<bmi>28.9007572351</bmi>
		</healthprofile>
	</person>
	<person id="20">
		<firstname>Karina</firstname>
		<lastname>Camacho</lastname>
		<birthdate>1984-03-21T18:00:00.000+02:00</birthdate>
		<healthprofile>
			<lastupdate>2014-04-10T18:00:00.000+02:00</lastupdate>
			<weight>103</weight>
			<height>1.73</height>
			<bmi>32.985397512168742</bmi>
		</healthprofile>
	</person> 
</people>
```


## Request based on Lab 3

**Request 1:** Use xpath to implement methods like getWeight and getHeight

```xpath
	/people/person[firstname="Paul" and lastname="Boga"]/healthprofile/weight
	/people/person[firstname="Paul" and lastname="Boga"]/healthprofile/height
```
```
	Paul Boga's weight is 70
	Paul Boga's height is 1.70
```

**Request 2:** Make a function that prints all people in the list with details

> The function iterateNode will print the person's details.

```xpath
	/people/person
```
```java
	public void iterateNode(Node node) {
		NodeList nodeList = node.getChildNodes();
		
		for (int k = 0; k < nodeList.getLength(); k++) {
			Node currentNode = nodeList.item(k);
			if (currentNode.getNodeType() == Node.ELEMENT_NODE) {
				if (currentNode.getNodeName().equals("healthprofile")) {
				}else {
					System.out.println(currentNode.getNodeName() + "= " + currentNode.getFirstChild().getNodeValue());
				}
				iterateNode(currentNode);
			}
		}
	}
```

**Request 3:** A function that accepts id as parameter and prints the HealthProfile of the person with that id

```xpath
	/people/person[@id=5]/healthprofile
```
```
	Person's a healthprofile with id 5
	lastupdate: 2014-01-20T18:00:00.000+02:00
	weight: 20
	height: 1.00
	bmi: 32.20
```

**Request 4:** A function which accepts a weight equals to 90 and an operator > as parameters and prints people that fulfill that condition

```xpath
	/people/person[healthprofile/weight>90]
```
```
	[George R. R., John, Karina]
```


## Request based on Lab 4

**Request 1:** Create the XML schema XSD file for the XML document of people

```xsd
<xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema">
	<!-- definition of root element -->
	<xsd:element name="people" type="peopleType" />
	<!-- definition of complex elements -->
	<xsd:complexType name="peopleType">
		<xsd:sequence>
			<xsd:element name="person" type="personType" maxOccurs="unbounded" />
		</xsd:sequence>
	</xsd:complexType>
	<xsd:complexType name="personType">
		<xsd:sequence>
			<xsd:element name="firstname" type="stringType" />
			<xsd:element name="lastname" type="stringType" />
			<xsd:element name="birthdate" type="dateType" />
			<xsd:element name="healthprofile" type="healthprofileType" />
		</xsd:sequence>
		<xsd:attribute name="id" type="xsd:long" use="required" />
	</xsd:complexType>
	<xsd:complexType name="healthprofileType">
		<xsd:sequence>
			<xsd:element name="lastupdate" type="dateType" />
			<xsd:element name="weight" type="doubleType" />
			<xsd:element name="height" type="doubleType" />
			<xsd:element name="bmi" type="doubleType" />
		</xsd:sequence>
	</xsd:complexType>
	<xsd:simpleType name="stringType">
		<xsd:restriction base="xsd:string" />
	</xsd:simpleType>
	<xsd:simpleType name="dateType">
		<xsd:restriction base="xsd:dateTime" />
	</xsd:simpleType>
	<xsd:simpleType name="doubleType">
		<xsd:restriction base="xsd:double" />
	</xsd:simpleType>
	<!-- 
	<xsd:simpleType name="decimalType">
		<xsd:restriction base="xsd:decimal" />
	</xsd:simpleType>
	<xsd:simpleType name="integerType">
		<xsd:restriction base="xsd:integer" />
	</xsd:simpleType> 
	-->
</xsd:schema>
```

**Request 2:** Write a java application that does the marshalling and un-marshalling using classes generated with JAXB XJC

> I created 7 people using java and marshall them to XML. This function will produce a people_new.xml in home folder. Then will read the xml file and print one at a time.  

```xml
**Marshalling to XML**
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<people>
    <person id="7374">
        <firstname>Carmen</firstname>
        <lastname>Quispe</lastname>
        <birthdate>27-03-1991</birthdate>
        <healthprofile>
            <lastupdate>22-04-2003</lastupdate>
            <weight>100.55</weight>
            <height>2.17</height>
            <bmi>21.35</bmi>
        </healthprofile>
    </person>
    <person id="2795">
        <firstname>Anthony</firstname>
        <lastname>Garcia</lastname>
        <birthdate>24-10-2014</birthdate>
        <healthprofile>
            <lastupdate>22-03-1954</lastupdate>
            <weight>145.39</weight>
            <height>1.9</height>
            <bmi>40.27</bmi>
        </healthprofile>
    </person>
    <person id="8320">
        <firstname>Guido</firstname>
        <lastname>Pugliese</lastname>
        <birthdate>04-10-1984</birthdate>
        <healthprofile>
            <lastupdate>18-09-1996</lastupdate>
            <weight>52.12</weight>
            <height>1.64</height>
            <bmi>19.38</bmi>
        </healthprofile>
    </person>
    <person id="5317">
        <firstname>Stefania</firstname>
        <lastname>Officioso</lastname>
        <birthdate>15-08-1978</birthdate>
        <healthprofile>
            <lastupdate>11-05-1979</lastupdate>
            <weight>42.62</weight>
            <height>2.08</height>
            <bmi>9.85</bmi>
        </healthprofile>
    </person>
    <person id="8265">
        <firstname>Joel</firstname>
        <lastname>Gonzalez</lastname>
        <birthdate>17-12-2007</birthdate>
        <healthprofile>
            <lastupdate>13-08-1960</lastupdate>
            <weight>76.91</weight>
            <height>1.98</height>
            <bmi>19.62</bmi>
        </healthprofile>
    </person>
    <person id="6618">
        <firstname>Andrea</firstname>
        <lastname>Bonte</lastname>
        <birthdate>09-02-1959</birthdate>
        <healthprofile>
            <lastupdate>10-09-1977</lastupdate>
            <weight>94.0</weight>
            <height>1.85</height>
            <bmi>27.47</bmi>
        </healthprofile>
    </person>
    <person id="3544">
        <firstname>Simonetta</firstname>
        <lastname>Perez</lastname>
        <birthdate>06-03-2015</birthdate>
        <healthprofile>
            <lastupdate>18-10-1967</lastupdate>
            <weight>72.61</weight>
            <height>1.87</height>
            <bmi>20.76</bmi>
        </healthprofile>
    </person>
</people>
```

```
**Un-Marshalling from XML**
Output from XML File: 
Person with id 7374: Carmen born 27-03-1991. Has an weight of 100.55 and height of 100.55.
Person with id 2795: Anthony born 24-10-2014. Has an weight of 145.39 and height of 145.39.
Person with id 8320: Guido born 04-10-1984. Has an weight of 52.12 and height of 52.12.
Person with id 5317: Stefania born 15-08-1978. Has an weight of 42.62 and height of 42.62.
Person with id 8265: Joel born 17-12-2007. Has an weight of 76.91 and height of 76.91.
Person with id 6618: Andrea born 09-02-1959. Has an weight of 94.0 and height of 94.0.
Person with id 3544: Simonetta born 06-03-2015. Has an weight of 72.61 and height of 72.61.
```

**Request 3:** Make your application to convert also JSON

> I created 7 people using java and marshall them to JSON. This function will print the content and save to people_new.json in home folder.

```json
**Marshalling to JSON**
{
  "person" : [ {
    "firstname" : "Carmen",
    "lastname" : "Quispe",
    "birthdate" : "07-05-1978",
    "healthprofile" : {
      "lastupdate" : "25-04-1982",
      "weight" : 79.48,
      "height" : 2.29,
      "bmi" : 15.16
    },
    "id" : 6309
  }, {
    "firstname" : "Anthony",
    "lastname" : "Garcia",
    "birthdate" : "16-09-1978",
    "healthprofile" : {
      "lastupdate" : "25-08-2003",
      "weight" : 98.6,
      "height" : 2.69,
      "bmi" : 13.63
    },
    "id" : 7015
  }, {
    "firstname" : "Guido",
    "lastname" : "Pugliese",
    "birthdate" : "25-07-1990",
    "healthprofile" : {
      "lastupdate" : "24-04-1962",
      "weight" : 33.67,
      "height" : 2.57,
      "bmi" : 5.1
    },
    "id" : 3839
  }, {
    "firstname" : "Stefania",
    "lastname" : "Officioso",
    "birthdate" : "09-10-1996",
    "healthprofile" : {
      "lastupdate" : "07-02-1955",
      "weight" : 71.61,
      "height" : 2.51,
      "bmi" : 11.37
    },
    "id" : 1294
  }, {
    "firstname" : "Joel",
    "lastname" : "Gonzalez",
    "birthdate" : "20-11-2013",
    "healthprofile" : {
      "lastupdate" : "01-06-2005",
      "weight" : 125.4,
      "height" : 2.69,
      "bmi" : 17.33
    },
    "id" : 3503
  }, {
    "firstname" : "Andrea",
    "lastname" : "Bonte",
    "birthdate" : "20-06-1962",
    "healthprofile" : {
      "lastupdate" : "08-10-2014",
      "weight" : 74.4,
      "height" : 2.19,
      "bmi" : 15.51
    },
    "id" : 4871
  }, {
    "firstname" : "Simonetta",
    "lastname" : "Perez",
    "birthdate" : "15-04-1957",
    "healthprofile" : {
      "lastupdate" : "03-08-2010",
      "weight" : 57.98,
      "height" : 1.96,
      "bmi" : 15.09
    },
    "id" : 2463
  } ]
}

```


## How to run it

```
	ant compile
	ant execute.evaluation
```
>Another way to run it
In the project is present ivy.xml file. Right click on this file and select  **Add Ivy Library**. This will add all ivy libraries to my project's classpath.
To do so, I will proceed as follows:
* Click on Classpath -> Enable project specific settings -> Resolve dependencies in workspace
```
	ant generate
	ant execute.evaluation
```


