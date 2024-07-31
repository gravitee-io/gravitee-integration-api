## [4.0.1](https://github.com/gravitee-io/gravitee-integration-api/compare/4.0.0...4.0.1) (2024-07-31)


### Bug Fixes

* **hello:** fix deserialization ([#33](https://github.com/gravitee-io/gravitee-integration-api/issues/33)) ([0cddad9](https://github.com/gravitee-io/gravitee-integration-api/commit/0cddad959d107de3ae6f1cf7929d97358a8d4ce3))

# [4.0.0](https://github.com/gravitee-io/gravitee-integration-api/compare/3.0.0...4.0.0) (2024-07-30)


* feat!: move payload of command inside command and use APIs ids during ingest ([0a019af](https://github.com/gravitee-io/gravitee-integration-api/commit/0a019af292e431c7220015295bad6003493a752b)), closes [#31](https://github.com/gravitee-io/gravitee-integration-api/issues/31)


### BREAKING CHANGES

* - construction of commands are little differents
- signature of start ingest is changed

# [3.0.0](https://github.com/gravitee-io/gravitee-integration-api/compare/2.1.1...3.0.0) (2024-07-25)


* feat(ingest)!: use APIs ids during ingest ([1542218](https://github.com/gravitee-io/gravitee-integration-api/commit/1542218764df8f64259fef71c0ccf28a9233726c))
* feat!: move payload of command inside command ([31913dd](https://github.com/gravitee-io/gravitee-integration-api/commit/31913dd4e23c8f6b6ccb2dafe1fa5fbdf9b0e993))


### BREAKING CHANGES

* signature of start ingest is changed
* construction of commands are little differents

## [2.1.1](https://github.com/gravitee-io/gravitee-integration-api/compare/2.1.0...2.1.1) (2024-07-23)


### Bug Fixes

* **api-model:** format need to be public ([#29](https://github.com/gravitee-io/gravitee-integration-api/issues/29)) ([babee1a](https://github.com/gravitee-io/gravitee-integration-api/commit/babee1a89bad5484f36c3e297cedb98c6dc7b292))

# [2.1.0](https://github.com/gravitee-io/gravitee-integration-api/compare/2.0.0...2.1.0) (2024-07-22)


### Features

* add characteristics to Plan's model ([df152f4](https://github.com/gravitee-io/gravitee-integration-api/commit/df152f42ef218cb6cdb299dcc9055a8b2b100e80))
* add metadata to Api's model ([a73bb36](https://github.com/gravitee-io/gravitee-integration-api/commit/a73bb36581f958e6f290c72cb0f590dd7776e6a5))

# [2.0.0](https://github.com/gravitee-io/gravitee-integration-api/compare/1.1.0...2.0.0) (2024-07-18)


### Features

* add new command StartIngest ([218bc63](https://github.com/gravitee-io/gravitee-integration-api/commit/218bc63720ae7eacd116894f60971d2370e9aed3))
* enhance Ingest command to handle an async Ingestion ([0564956](https://github.com/gravitee-io/gravitee-integration-api/commit/05649569b0bb753f1eef8a30df2aadca7521d6da))
* provide ExchangeConnectorManager when building IntegrationProvider ([f3ec68d](https://github.com/gravitee-io/gravitee-integration-api/commit/f3ec68d7ab3b7cc993ad03fb2209a0c37d64f2c9))
* remove ingest method from IntegrationProvider ([a3b60f8](https://github.com/gravitee-io/gravitee-integration-api/commit/a3b60f8e24ad08bdd6f33d46a1940b444bd3f8e3))


### BREAKING CHANGES

* remove ingest method from IntegrationProvider
* IntegrationProviderFactory create function has been updated to provide
the ExchangeConnectorManager

# [1.1.0](https://github.com/gravitee-io/gravitee-integration-api/compare/1.0.1...1.1.0) (2024-07-02)


### Features

* add Gravitee Application id in the Subscription model ([98d1753](https://github.com/gravitee-io/gravitee-integration-api/commit/98d175322a40cfd99f593e5595b174e191beef46))

## [1.0.1](https://github.com/gravitee-io/gravitee-integration-api/compare/1.0.0...1.0.1) (2024-06-20)


### Bug Fixes

* make models serializable ([55efcb5](https://github.com/gravitee-io/gravitee-integration-api/commit/55efcb55525ba440bd20d6ff5d20fc08aef8c0a4))

# 1.0.0 (2024-06-17)


### Bug Fixes

* define lombok annotation to generate builder and equals methods ([36e275f](https://github.com/gravitee-io/gravitee-integration-api/commit/36e275ffd3cc83589bd21679c5c601c539d4fc0a))
* remove AbstractIntegrationProviderConfiguration ([a7d3168](https://github.com/gravitee-io/gravitee-integration-api/commit/a7d3168650e54dd7126a39faf17e75b7176c5451))
* rename OAUTH to OAUTH2 to comply with apim ([#13](https://github.com/gravitee-io/gravitee-integration-api/issues/13)) ([120921b](https://github.com/gravitee-io/gravitee-integration-api/commit/120921bbd9ca025795456f10b68d831a14b19c75))
* return a result instead of updated subscription when subscribing ([54ec4d7](https://github.com/gravitee-io/gravitee-integration-api/commit/54ec4d74022411e3e0166bf2fe70f8adaee7fc15))


### Features

* add Api unique id ([#9](https://github.com/gravitee-io/gravitee-integration-api/issues/9)) ([6c38079](https://github.com/gravitee-io/gravitee-integration-api/commit/6c38079fe2e2b56b22e3f0780f6bd4a22c4cf314))
* add description to Plan ([c229ced](https://github.com/gravitee-io/gravitee-integration-api/commit/c229ced3510c7fb2f26368b8411fd807a98f26e4))
* add name in Plan for import ([0de61cd](https://github.com/gravitee-io/gravitee-integration-api/commit/0de61cd45ee905f9146112314b9ab26539fcd62e))
* add unsubscribe method ([63ba8e8](https://github.com/gravitee-io/gravitee-integration-api/commit/63ba8e800529d61d214a86f7e14214db3b75ce82))
* change IntegrationProviderFactory signature to rely on Spring env ([2f6f9a3](https://github.com/gravitee-io/gravitee-integration-api/commit/2f6f9a343be796cfa434ba15f6280da81d2382e9))
* init integration api with commands, model and plugin interface ([d2d7173](https://github.com/gravitee-io/gravitee-integration-api/commit/d2d7173ed03d93ca70123a83da630bd78cd2a644))
* remove environmentId in HelloPayload ([45f948c](https://github.com/gravitee-io/gravitee-integration-api/commit/45f948c91b970b0b5b9aea71a9e913821ebac0ea))
* rename element to follow naming used in Federation team ([#7](https://github.com/gravitee-io/gravitee-integration-api/issues/7)) ([cdad394](https://github.com/gravitee-io/gravitee-integration-api/commit/cdad394c5339de39d9e588a9bdd31f8d8e96d4cf))
* simplify Subscription model ([f3c9351](https://github.com/gravitee-io/gravitee-integration-api/commit/f3c935194be4b711eda2b9da91abfeed86321a6a))
* **solace:** add properties used for solace subscription ([#17](https://github.com/gravitee-io/gravitee-integration-api/issues/17)) ([953745f](https://github.com/gravitee-io/gravitee-integration-api/commit/953745f09ef9127d8df9369236853c08f9ab802a))
* to distinct validation type by provider let provider plugin select the validation method ([#18](https://github.com/gravitee-io/gravitee-integration-api/issues/18)) ([f34806c](https://github.com/gravitee-io/gravitee-integration-api/commit/f34806c7a09af7fa018c5693abe9d4f538fcf28e))
* use gravitee-node Configuration interface ([857f813](https://github.com/gravitee-io/gravitee-integration-api/commit/857f813570bb55c278b6ec9c9b64e88ac9eea4b7))


### Reverts

* Revert "feat: to distinct validation type by provider let provider plugin sel…" ([83f660f](https://github.com/gravitee-io/gravitee-integration-api/commit/83f660f76021b875c6997d1f0c7aade9c19c151a))

# [1.0.0-alpha.14](https://github.com/gravitee-io/gravitee-integration-api/compare/1.0.0-alpha.13...1.0.0-alpha.14) (2024-06-11)


### Features

* to distinct validation type by provider let provider plugin select the validation method ([#18](https://github.com/gravitee-io/gravitee-integration-api/issues/18)) ([f34806c](https://github.com/gravitee-io/gravitee-integration-api/commit/f34806c7a09af7fa018c5693abe9d4f538fcf28e))

# [1.0.0-alpha.13](https://github.com/gravitee-io/gravitee-integration-api/compare/1.0.0-alpha.12...1.0.0-alpha.13) (2024-05-27)


### Features

* **solace:** add properties used for solace subscription ([#17](https://github.com/gravitee-io/gravitee-integration-api/issues/17)) ([953745f](https://github.com/gravitee-io/gravitee-integration-api/commit/953745f09ef9127d8df9369236853c08f9ab802a))

# [1.0.0-alpha.12](https://github.com/gravitee-io/gravitee-integration-api/compare/1.0.0-alpha.11...1.0.0-alpha.12) (2024-05-17)


### Features

* add unsubscribe method ([63ba8e8](https://github.com/gravitee-io/gravitee-integration-api/commit/63ba8e800529d61d214a86f7e14214db3b75ce82))

# [1.0.0-alpha.11](https://github.com/gravitee-io/gravitee-integration-api/compare/1.0.0-alpha.10...1.0.0-alpha.11) (2024-05-16)


### Bug Fixes

* return a result instead of updated subscription when subscribing ([54ec4d7](https://github.com/gravitee-io/gravitee-integration-api/commit/54ec4d74022411e3e0166bf2fe70f8adaee7fc15))

# [1.0.0-alpha.10](https://github.com/gravitee-io/gravitee-integration-api/compare/1.0.0-alpha.9...1.0.0-alpha.10) (2024-05-14)


### Bug Fixes

* rename OAUTH to OAUTH2 to comply with apim ([#13](https://github.com/gravitee-io/gravitee-integration-api/issues/13)) ([120921b](https://github.com/gravitee-io/gravitee-integration-api/commit/120921bbd9ca025795456f10b68d831a14b19c75))

# [1.0.0-alpha.9](https://github.com/gravitee-io/gravitee-integration-api/compare/1.0.0-alpha.8...1.0.0-alpha.9) (2024-05-06)


### Features

* simplify Subscription model ([f3c9351](https://github.com/gravitee-io/gravitee-integration-api/commit/f3c935194be4b711eda2b9da91abfeed86321a6a))

# [1.0.0-alpha.8](https://github.com/gravitee-io/gravitee-integration-api/compare/1.0.0-alpha.7...1.0.0-alpha.8) (2024-05-02)


### Features

* use gravitee-node Configuration interface ([857f813](https://github.com/gravitee-io/gravitee-integration-api/commit/857f813570bb55c278b6ec9c9b64e88ac9eea4b7))

# [1.0.0-alpha.7](https://github.com/gravitee-io/gravitee-integration-api/compare/1.0.0-alpha.6...1.0.0-alpha.7) (2024-04-19)


### Features

* add description to Plan ([c229ced](https://github.com/gravitee-io/gravitee-integration-api/commit/c229ced3510c7fb2f26368b8411fd807a98f26e4))

# [1.0.0-alpha.6](https://github.com/gravitee-io/gravitee-integration-api/compare/1.0.0-alpha.5...1.0.0-alpha.6) (2024-04-15)


### Features

* add Api unique id ([#9](https://github.com/gravitee-io/gravitee-integration-api/issues/9)) ([6c38079](https://github.com/gravitee-io/gravitee-integration-api/commit/6c38079fe2e2b56b22e3f0780f6bd4a22c4cf314))

# [1.0.0-alpha.5](https://github.com/gravitee-io/gravitee-integration-api/compare/1.0.0-alpha.4...1.0.0-alpha.5) (2024-04-09)


### Features

* rename element to follow naming used in Federation team ([#7](https://github.com/gravitee-io/gravitee-integration-api/issues/7)) ([cdad394](https://github.com/gravitee-io/gravitee-integration-api/commit/cdad394c5339de39d9e588a9bdd31f8d8e96d4cf))

# [1.0.0-alpha.4](https://github.com/gravitee-io/gravitee-integration-api/compare/1.0.0-alpha.3...1.0.0-alpha.4) (2024-04-03)


### Bug Fixes

* define lombok annotation to generate builder and equals methods ([36e275f](https://github.com/gravitee-io/gravitee-integration-api/commit/36e275ffd3cc83589bd21679c5c601c539d4fc0a))


### Features

* add name in Plan for import ([0de61cd](https://github.com/gravitee-io/gravitee-integration-api/commit/0de61cd45ee905f9146112314b9ab26539fcd62e))

# [1.0.0-alpha.3](https://github.com/gravitee-io/gravitee-integration-api/compare/1.0.0-alpha.2...1.0.0-alpha.3) (2024-03-25)


### Features

* remove environmentId in HelloPayload ([45f948c](https://github.com/gravitee-io/gravitee-integration-api/commit/45f948c91b970b0b5b9aea71a9e913821ebac0ea))

# [1.0.0-alpha.2](https://github.com/gravitee-io/gravitee-integration-api/compare/1.0.0-alpha.1...1.0.0-alpha.2) (2024-03-25)


### Bug Fixes

* remove AbstractIntegrationProviderConfiguration ([a7d3168](https://github.com/gravitee-io/gravitee-integration-api/commit/a7d3168650e54dd7126a39faf17e75b7176c5451))


### Features

* change IntegrationProviderFactory signature to rely on Spring env ([2f6f9a3](https://github.com/gravitee-io/gravitee-integration-api/commit/2f6f9a343be796cfa434ba15f6280da81d2382e9))

# 1.0.0-alpha.1 (2024-03-18)


### Features

* init integration api with commands, model and plugin interface ([d2d7173](https://github.com/gravitee-io/gravitee-integration-api/commit/d2d7173ed03d93ca70123a83da630bd78cd2a644))
