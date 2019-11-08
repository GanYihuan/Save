# scss

## 1:安装 ruby

ruby –v

## 2: 安装 sass

sudo gem install sass
sass –v

## 3: 写一个 sass 文件放在桌面

终端写 sass --watch test.scss:test.css
就会生成 css 文件

## 4: 检测 sass 更新

gem update sass

## 5: 卸载 sass

gem uninstall sass

## 6: 开启“watch”功能，这样只要你的代码进行任保修改，都能自动监测到代码的变化，并且给你直接编译出来：

sass --watch <要编译的 Sass 文件路径>/style.scss:<要输出 CSS 文件路径>/style.css
我要把项目中“bootstrap.scss”编译出“bootstrap.css”文件，并且将编译出来的文件放在“css”文件夹中，我就可以在我的命令终端中执行：
sass --watch sass/bootstrap.scss:css/bootstrap.css

## 1、嵌套输出方式 nested

sass --watch test.scss:test.css --style nested

## 2、嵌套输出方式 expanded

sass --watch test.scss:test.css --style expanded

## 2、嵌套输出方式 compact

sass --watch test.scss:test.css --style compact

## 2、压缩输出方式 compressed

sass --watch test.scss:test.css --style compressed
