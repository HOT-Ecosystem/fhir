## FHIR Build Options

To build and run the FHIR Publisher with additional options, you run the build
via ant.

### To run FHIR build with no sounds:

```bash
ant -Dargs "-nosound 1"
```
Note: This option can be coupled with any other option(s), provided that it is
listed first.

### To run FHIR build on only one resource:

```bash
ant -Dargs "-resource resourceName"
```

Where "resourceName" is the name of your resource.

### To skip all resource validation:

```bash
ant -Dargs "-noValidate"
```

Note: This option can be coupled with the singular -resource option.
For example:

```bash
ant -Dargs "-nosound 1 -resource Sample -noValidate"
```

### To validate only the resource examples:

```bash
and -Dargs "-validateExamples"
```

Note: This option can be coupled with the singular -resource option.
For example:

```bash
ant -Dargs "-nosound 1 -resource Sample -validateExamples"
```
