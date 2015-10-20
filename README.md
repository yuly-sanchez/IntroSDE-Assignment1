# Assignment 01: Reading/Writing objects to and from XML and JSON


## File XML People

```xml
<people>
    <person id="0001">
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
    <person id="0002">
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
	<person id="0003">
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
	<person id="0004">
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
	<person id="0005">
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
	<person id="0006">
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
	<person id="0007">
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
	<person id="0008">
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
	<person id="0009">
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
	<person id="0010">
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
	<person id="0011">
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
	<person id="0012">
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
	<person id="0013">
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
	<person id="0014">
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
	<person id="0015">
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
	<person id="0016">
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
	<person id="0017">
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
	<person id="0018">
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
	<person id="0019">
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
	<person id="0020">
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

## Packages content into the project 
* package assignment.adapter contains the DateAdapter class
* package assignment.dao contains the PeopleStore class
* package assignment.model contains HealthProfile and Person classes
* package assignment.people contains JAXBMarshallerXML and JAXBUnMarshallerXML classes
* package assignment.people.generated contains the classes generated with JAXB XJC
* package assignment.src contains the classes: 
	- **HealthProfileReader** which will run the requests based on Laboratory 3.
	- **JAXBAnnotationsXml** which will marshall (to XML) and unmarshall (from XML). This class will print and create *people_new* xml file in the home folder which contains 7 people. Finally will read the people_new.xml file and print one at a time.
	- **JAXBMarshallerJson** which will marshall (to JSON). This class will print and produce a *people_new.json* in home folder. 
* package assignment.utils contains RandomNumberHelper class which contain the methods to generate random interger / double numbers in the range (min,max]


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

> The iterateNode function will print the person's details.

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

**Request 3:** A function that accepts id as parameter and prints the HealthProfile of the person with that id equals to 5

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
	Person id n°: 0001
	firstname: George R. R.
	lastname: Martin
	birthdate: 1984-09-20T18:00:00.000+02:00
	lastupdate: 2014-09-20T18:00:00.000+02:00
	weight: 100
	height: 1.70
	bmi: 31.14

	Person id n°: 0004
	firstname: John
	lastname: Doe
	birthdate: 1984-09-20T18:00:00.000+02:00
	lastupdate: 2014-09-20T18:00:00.000+02:00
	weight: 92
	height: 1.72
	bmi: 22.985397512168742

	Person id n°: 0020
	firstname: Karina
	lastname: Camacho
	birthdate: 1984-03-21T18:00:00.000+02:00
	lastupdate: 2014-04-10T18:00:00.000+02:00
	weight: 103
	height: 1.73
	bmi: 32.985397512168742
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

> I created 7 people using java invocating inizializedDB function. The JABXAnnotationsXML class will do marshall java objects to XML and will produce a people_new.xml in home folder. This class also will read the xml file created and print one at a time.

```xml
**Marshalling to XML using model classes**

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
**Un-Marshalling from XML using model classes**
Output from XML File: 
Person with id 7374: Carmen born 27-03-1991. Has an weight of 100.55 and height of 100.55.
Person with id 2795: Anthony born 24-10-2014. Has an weight of 145.39 and height of 145.39.
Person with id 8320: Guido born 04-10-1984. Has an weight of 52.12 and height of 52.12.
Person with id 5317: Stefania born 15-08-1978. Has an weight of 42.62 and height of 42.62.
Person with id 8265: Joel born 17-12-2007. Has an weight of 76.91 and height of 76.91.
Person with id 6618: Andrea born 09-02-1959. Has an weight of 94.0 and height of 94.0.
Person with id 3544: Simonetta born 06-03-2015. Has an weight of 72.61 and height of 72.61.
```

> Another way to do marshall java objects to XML. Using JAXB and generated class with JAXB XJC.This class will produce a *people_new_xjc.xml* in home folder. 

```xml
**Marshalling to XML using generated class with JAXB XJC**

<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<people>
    <person id="1">
        <firstname>Carmen</firstname>
        <lastname>Quispe</lastname>
        <birthdate>1929-01-04T18:12:46.076+01:00</birthdate>
        <healthprofile>
            <lastupdate>1925-01-03T17:54:25.113+01:00</lastupdate>
            <weight>143.34</weight>
            <height>1.55</height>
            <bmi>59.66</bmi>
        </healthprofile>
    </person>
    <person id="2">
        <firstname>Anthony</firstname>
        <lastname>Garcia</lastname>
        <birthdate>1935-01-07T00:11:06.133+01:00</birthdate>
        <healthprofile>
            <lastupdate>1935-01-26T22:18:54.134+01:00</lastupdate>
            <weight>57.52</weight>
            <height>1.75</height>
            <bmi>18.78</bmi>
        </healthprofile>
    </person>
    <person id="3">
        <firstname>Guido</firstname>
        <lastname>Pugliese</lastname>
        <birthdate>1945-01-28T05:31:55.135+01:00</birthdate>
        <healthprofile>
            <lastupdate>2009-01-14T05:46:50.135+01:00</lastupdate>
            <weight>32.42</weight>
            <height>2.74</height>
            <bmi>4.32</bmi>
        </healthprofile>
    </person>
    <person id="4">
        <firstname>Stefania</firstname>
        <lastname>Officioso</lastname>
        <birthdate>1926-01-05T20:47:03.136+01:00</birthdate>
        <healthprofile>
            <lastupdate>1992-01-24T07:41:31.137+01:00</lastupdate>
            <weight>41.75</weight>
            <height>2.9</height>
            <bmi>4.96</bmi>
        </healthprofile>
    </person>
    <person id="5">
        <firstname>Joel</firstname>
        <lastname>Gonzalez</lastname>
        <birthdate>2011-01-09T05:44:33.138+01:00</birthdate>
        <healthprofile>
            <lastupdate>1905-01-28T15:26:12.138+01:00</lastupdate>
            <weight>95.19</weight>
            <height>2.36</height>
            <bmi>17.09</bmi>
        </healthprofile>
    </person>
    <person id="6">
        <firstname>Andrea</firstname>
        <lastname>Bonte</lastname>
        <birthdate>1974-01-10T21:21:44.139+01:00</birthdate>
        <healthprofile>
            <lastupdate>1987-01-16T22:31:30.140+01:00</lastupdate>
            <weight>147.87</weight>
            <height>2.17</height>
            <bmi>31.4</bmi>
        </healthprofile>
    </person>
    <person id="7">
        <firstname>Simonetta</firstname>
        <lastname>Perez</lastname>
        <birthdate>1912-01-23T11:53:25.140+01:00</birthdate>
        <healthprofile>
            <lastupdate>1925-01-08T15:57:02.141+01:00</lastupdate>
            <weight>76.04</weight>
            <height>1.82</height>
            <bmi>22.96</bmi>
        </healthprofile>
    </person>
</people>
```

```
**Un-Marshalling to XML using generated class with JAXB XJC**
Output from XML File: 
Person with id 1: Quispe, Carmen born 04-01-1929. Has an weight of 143.34 kg. and a height of 1.55
Person with id 2: Garcia, Anthony born 07-01-1935. Has an weight of 57.52 kg. and a height of 1.75
Person with id 3: Pugliese, Guido born 28-01-1945. Has an weight of 32.42 kg. and a height of 2.74
Person with id 4: Officioso, Stefania born 05-01-1926. Has an weight of 41.75 kg. and a height of 2.9
Person with id 5: Gonzalez, Joel born 09-01-2011. Has an weight of 95.19 kg. and a height of 2.36
Person with id 6: Bonte, Andrea born 10-01-1974. Has an weight of 147.87 kg. and a height of 2.17
Person with id 7: Perez, Simonetta born 23-01-1912. Has an weight of 76.04 kg. and a height of 1.82
```

**Request 3:** Make your application to convert also JSON

> I created 7 people using java and marshall them to JSON. This function will print the content and save to people_new.json in home folder.

```json
**Marshalling to JSON using model classes**

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
> If you want marshall and unmarshall using classes generated with JAXB XJC. You wil execute the commands:
 
```	
	ant execute.JAXBMarshaller
	ant execute.JAXBUnMarshaller
```


