# MyData Solution
MyData solution provides customers financial servies with personal credit information collected from other finantial companies or public organizations. 

## References
MyData Center <https://www.mydatacenter.or.kr:3441/>

## Techonolgies
- JDK 20.0.2
- SpringBoot 3.1.2
- Oracle Database 21c XE
- Kafka 3.5.1
- Vue.js 3.2.13
- Maven 3.8.7

## Projects
- frontend
    - User Interface
    - Vue.js Project
- backend
    - Provider and Consumer API Module Project
    - Maven Module Project
- auth
    - User or other organizations authenticate through this API
    - Maven Module Project
- batch
    - Batch project to fetch MyData from other organizations regularily
    - Maven Module Project
- mock-other-org
    - Mock organization for test
    - Separate Maven Project
- mock-portal
    - Mock My Data Portal for test
    - Separate Maven Project
- mock-ca
    - Mock Certificate Authorities for test
    - Separate Maven Project
