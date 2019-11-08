修改默认主题，主题好丑的

在Sublime Text 3 MarkdownEditing插件打开md文件默认的主题很丑，而且文字居中，左侧有大片空白，需要修改配置文件调整一下。

流程:
打开Default和User
ctrl+shift+p打开命令输入

Preference: MarkdownEditing Setting

然后会出现下面两个选项，分别打开

Preference: MarkdownEditing Setting: Default
Preference: MarkdownEditing Setting: User

复制user

将Preference: MarkdownEditing Setting: Default对应文件全部内容复制到Preference: MarkdownEditing Setting: User中

修改User

在Preference: MarkdownEditing Setting: User中修改

 "color_scheme": "Packages/MarkdownEditing/MarkdownEditor.tmTheme",
 // "color_scheme": "Packages/MarkdownEditing/MarkdownEditor-Dark.tmTheme",


改为以下

// "color_scheme": "Packages/MarkdownEditing/MarkdownEditor.tmTheme",
 "color_scheme": "Packages/MarkdownEditing/MarkdownEditor-Dark.tmTheme",


修改主题为深色，与sublime主题一一致

// Layout
"draw_centered": false, // 改为false，原始值为true
"word_wrap": true,
"wrap_width": 120, // 每行字符数上限
"rulers": [],
