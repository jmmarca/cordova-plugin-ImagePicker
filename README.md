# cordova-plugin-ImagePicker

Muito obrigado [South dust] (https://github.com/nanchen2251) e [banchichen] (https://github.com/banchichen) suporte de código-fonte para a estrela multi-estrelas O código aberto não é fácil, obrigado. Grupo de fivelas de botões: 240255635

Uma escolha múltipla de suporte, álbum de fotos para alcançar uma foto, visualização, (compressão de imagem do Android) e outras funções

função ##

- diretório do álbum
- Escolha mais fotos
- foto interna do álbum de fotos
- Visualizar a imagem selecionada
- Compressão de imagem (Android)

## Requisitos de instalação

- Cordova Version> = 5.0
- Cordova-Android> = 4.0
- Cordova-iOS> = 6.0

## iOS Requisitos de requisitos

OS 6 ou posterior. Requer ARC disponível para iOS6 e acima. Ambiente ARC.

Quando a versão do sistema é iOS6 ou iOS7, Usando a AssetsLibrary. Quando a versão do sistema é iOS8 ou posterior, usando o PhotoKit. Se estiver executando no sistema iOS6 ou 7, use a biblioteca AssetsLibrary para obter recursos de fotos. Se estiver executando no iOS8 e acima, use a biblioteca PhotoKit para obter os recursos da foto.

## instalação

1. Linha de comando 'plugin cordova adicionar https: // github.com / gigantes / cordova-plugin-ImagePicker.git`
2. Execute cordova build --device a partir da linha de comando

Nota: o projeto do Android primeiro não cria diretamente, veja [nota do Android] (# nota do Android).

# Demo de video do Android

[Clique para ver o vídeo (formato mp4)] (http://oqdxjvpc7.bkt.clouddn.com/111.mp4) <br>
[Clique para ver o vídeo (Youku)] (http://v.youku.com/v_show/id_XMjg0NDg0NDIyMA==.html)

## iOS Video Demo

[Clique para ver o vídeo (formato mp4)] (http://oqdxjvpc7.bkt.clouddn.com/ios1.mp4) <br>
[Clique para ver o vídeo (Youku)] (http://v.youku.com/v_show/id_XMjg0NDg0NTU4OA==.html)

## renderings

Android | iOS |
|: ---------------: |: ------------: |
| <img src = "./ res / android.png" width = "270px" height = "480"> | <img src = "./ res / ios.jpg" width = "270px" height = "480"> |

## use

### Nota: Os seguintes parâmetros passados ​​na demo não podem ser aprovados, o programa padrão definirá os seguintes parâmetros de aprovação de demonstração, se você precisar passar parâmetros, deve passar juntos, `não pode ser menos ', ou o erro do json será reportado .

`` `javascript
ImagePicker.getPictures (função (resultado) {
    alerta (resultado);
}, function (err) {
    alerta (erro);
}, {maximumImagesCount: 9, width: 1920, height: 1440, quality: 100});
`` `

## significado do parâmetro

Parâmetros de Configuração | Parâmetro Significado |
|: ------------------: |: -------------------------: |
| maximumImagesCount | Multi-select o número de restrições, o padrão é 9 |
| largura | definir a largura da imagem, o padrão é 1920 |
| height | define a altura da imagem, o padrão é 1440 |
qualidade | qualidade da imagem padrão 100 |

## android note

### Modifique o nome do pacote
adicione o plugin ao projeto após a primeira compilação direta, a implementação dos seguintes passos

- Diretório global do diretório de pesquisa global, substitua todos os "com.your.package.name" pelo nome do pacote quando você cria seu próprio projeto.
- construir

### build não suporta o problema do operador Diamond
sourceCompatibility 1.6 não suporta o operador de diamante
`` `
Erro: operador de diamante não suportado na fonte 1.6
        else imageFolders = novo ArrayList <> ();
                                          ^
  (Use a fonte 7 ou posterior para habilitar o operador de diamante)
`` `
Modifique o projeto Android sob o arquivo build.gradle
`` `
compileOptions {
    sourceCompatibility JavaVersion.VERSION_1_6
    targetCompatibility JavaVersion.VERSION_1_6
}
`` `
Mudar para
`` `
compileOptions {
    sourceCompatibility JavaVersion.VERSION_1_7
    targetCompatibility JavaVersion.VERSION_1_7
}
`` `

### faltando colors.xml, problema do arquivo provider_paths.xml
Ocorreu o seguinte erro
`` `
Erro: / Usuários / guodapeng / Documentos / Cordova / skateboard / plataformas / android / gradlew: Comando falhado com o código de saída 1 Saída de erro:
/Users/guodapeng/Documents/Cordova/skateboard/platforms/android/res/drawable/selector_back_press.xml:4:29-46: AAPT: Nenhum recurso encontrado que corresponde ao nome dado (em 'drawable' com valor '@ color / theme_body ').
`` `
Copie o arquivo colors.xml para o diretório cordova-plugin-ImagePicker / src / android / res / values ​​/ para as plataformas / android / res / values ​​/ directory

Ocorreu o seguinte erro
`` `
Erro: / Usuários / guodapeng / Documentos / Cordova / skateboard / plataformas / android / gradlew: Comando falhado com o código de saída 1 Saída de erro:
/Users/guodapeng/Documents/Cordova/skateboard/platforms/android/build/intermediates/manifests/full/debug/AndroidManifest.xml:66:35-54: AAPT: Nenhum recurso encontrado que corresponde ao nome dado (no 'recurso' com valor '@ xml / provider_paths').
`` `
Copie o arquivo provider_paths.xml do diretório cordova-plugin-ImagePicker / src / android / res / xml / para as plataformas / diretório android / res / xml /

### problema de seleção de mapa de recuperação flash plug-in
Ao instalar o plug-in de código QR, você pode contornar o problema de flashback alterando o suporte-v4 para a seguinte versão no arquivo patient-barcodescanner.gradle.
`` `
com.android.support:support-v4:25.3.1
`` `

## Licença

[A Licença MIT (MIT)] (http://www.opensource.org/licenses/mit-license.html)
