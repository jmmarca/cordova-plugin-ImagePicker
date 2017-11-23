#!/bin/bash
git add -A && git commit -m "Correção Geral"
git push
cd ..\midgard\packages\midgard-app-mobile\src\mobile
npx phonegap plugin rm cordova-plugin-ImagePicker --save
npx phonegap plugin add https://github.com/jmmarca/cordova-plugin-ImagePicker.git --save
cordova build --device
#cd ../../
#npm run android