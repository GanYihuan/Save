# shortcut

## 包管理网址

<https://packagecontrol.io/>

## 安装 packagecontrol

control + ` 打开控制台
粘贴 packagecontrol.io/installation
里的 sublime text3 代码

`
import urllib.request,os,hashlib; h = '6f4c264a24d933ce70df5dedcf1dcaee' + 'ebe013ee18cced0ef93d5f746d80ef60'; pf = 'Package Control.sublime-package'; ipp = sublime.installed_packages_path(); urllib.request.install_opener( urllib.request.build_opener( urllib.request.ProxyHandler()) ); by = urllib.request.urlopen( 'http://packagecontrol.io/' + pf.replace(' ', '%20')).read(); dh = hashlib.sha256(by).hexdigest(); print('Error validating download (got %s instead of %s), please try manual install' % (dh, h)) if dh != h else open(os.path.join( ipp, pf), 'wb' ).write(by)
`

command + shift + p -> pageckage Control: 命令面板 安装

One Dark Gravity (SL).tmTheme 主题
AdvanceNewFile 打开相应文件
Git
SyncedSideBar
Sass
Emmet

## 1:多重光标

ctrl + click1

## 2:选择一行单词

ctrl + shift + <-

## 3:选择单个单词

alt + shift + <-

## 4:向下复制

ctrl + shift + d

## 5:格式化

ctrl + shift + h

## 6: 整体右缩进

ctrl + ]

## 7: 换上一行(shift 反向操作)

shift + ctrl + enter

## 8: 选择一个单词

ctrl + d

## 18:单词间跳过

option + 方向键

## 19:尽头间跳过

ctrl + 方向键

## 20: 多重光标

option + click1

## 21: 移动代码向下

control + ctrl + down

## 22:

ctrl + p
@ 定位函数
：定位行号

## 23: 查找

ctrl + F
enter：下一个
shift + enter : 上一个

## 29: 查找替换

ctrl + option + F

## 30: 回跳一个操作

control + -

## 31: 前跳一个操作

control + shift + -

## 1:打开项目

ctrl + o

## 2:打开命令行

control + `

## 3:命令面板

shift + ctrl + p

## 4:找文件

ctrl + p

## 5:去除侧边栏菜单

ctrl + k, ctrl + b

## 6:命令面板里 key binding

打开快捷键设置

## 7: 创建新窗口

ctrl + shift + n

## 8: 页面间跳转

option + ctrl + 方向键

## 9:切换为 Css 文件

命令面板 set-syntext Css

## 11:创建文件

option + ctrl + n

## 12: 打开控制台

control + ``

## 13: 打开 shortcut || pref-> key binding user 设置

control + ,

## 14:自定义快捷代码 snippet

保存在 sublime text ------ Packages ------ User
在指定的 text, html, markdown 文件里能
快速生成内部格式文本
‘top’ + tab 为快捷键

## markdown 实现实时预览功能

- PC -> mp

## com + shi + p -> list package

## 能自动生成

## command + shift + p -> autoprefixer css

```css
-webkit-transform: rotate(45deg);
transform: rotate(45deg);
```

## 需要输入颜色时，可直接选取颜色

## command + shift + p -> color picker

## console 控制台

## control + ``

```md
符号说明:
符号 说明
⌘ command
⌃ control
⌥ option
⇧ shift
↩ enter
⌫ delete

快捷键 功能:
⌘⇧N 打开一个新的 sublime 窗口
⌘N 新建文件
⌘⇧W 关闭 sublime，关闭所有文件
⌘W 关闭当前文件
⌘P 跳转、前往文件、前往项目、命令提示、前往 method 等等（Goto anything）
⌘⇧T 重新打开最近关闭的文件
⌘T 前往文件
⌘⌃P 前往项目
⌘R 前往 method
⌘⇧P 命令提示
⌃G 前往行
⌘KB 开关侧栏
⌃` 打开控制台
⌃- 光标跳回上一个位置
⌃⇧- 光标恢复位置

编辑
快捷键 功能:
⌘A 全选
⌘L 选择行（重复按下将下一行加入选择）
⌘D 选择词（重复按下时多重选择相同的词进行多重编辑）
⌃⇧M 选择括号的内容
⌘⇧↩ 在当前行前插入新行
⌘↩ 在当前行后插入新行
⌃⇧K 删除行
⌘KK 从光标处删除至行尾
⌘K⌫ 从光标处删除至行首
⌘⇧D 复制（多）行
⌘J 合并（多）行
⌘KU 改为大写
⌘KL 改为小写
⌘C 复制
⌘X 剪切
⌘V 粘贴
⌘/ 注释
⌘⌥/ 块注释
⌘Z 撤销
⌘Y 恢复撤销
⌘⇧V 粘贴并自动缩进
⌘⌥V 从历史中选择粘贴
⌃M 跳转至对应的括号
⌘U 软撤销（可撤销光标移动）
⌘⇧U 软重做（可重做光标移动）
⌘⇧S 保存所有文件
⌘] 向右缩进
⌘[ 向左缩进
⌘⌥T 特殊符号集 ˇ
⌘⇧L 将选区转换成多个单行选区
查找/替换
快捷键 功能
⌘f 查找
⌘⌥f 查找并替换
⌘⌥g 查找下一个符合当前所选的内容
⌘⌃g 查找所有符合当前选择的内容进行多重编辑
⌘⇧F 在所有打开的文件中进行查找

拆分窗口/标签页
快捷键 功能:
⌘⌥[1,2,3,4] 单列、双列、三列、四列
⌘⌥5 网格（4 组）
⌃[1,2,3,4] 焦点移动到相应的组（分屏编号）
⌃⇧[1,2,3,4] 将当前文件移动到相应的组（分屏编号）
⌘[1,2,3,4] 选择相应的标签页

快捷操作
快捷键 功能
⌘⌃ 上下键 两行交换位置
⌘KB 显示/隐藏侧边
```
