# iTerm 短命令

## 查看所有端口情况

```console
lsof | less
```

## 查看 8080 端口是否被占用

```console
lsof -i:8080
```

## 杀死对应端口进程

```console
kill PID
```

## 杀死所有 node 进程

```console
pkill -9 node
```

## taobao, 如果想下载 express 的话，只需要使用–registry 参数指定镜像服务器地址

> [node官网](https://nodejs.org/en/)

```console
npm install express --registry=http://registry.npm.taobao.org
```

> 可以使用如下命令进行永久设置

```console
npm config set registry http://registry.npm.taobao.org
```

## 管理 node 版本

```console
npm i nvm
nvm ls
nvm install 8.9.1
nvm use 8.9.1
```

## 出现 `--update-binary` 要重装相关 npm

## 管理下载源

```console
npm install nrm
nrm ls
nrm use
```

## 打开当前目录的文件夹

```console
open .
```

## 进入根目录

```console
cd /
```

## 回到上级目录

```console
cd ..
```

## 改变当前目录

```console
cd
```

## 想看看 Pictures 目录下有什么

```console
ls
```

## 显示当前目录的内容

```console
ls
```

## 想看看目录详细情况

```console
ls -la
ll
```

## 创建一个目录

```console
mkdir dirname
```

## 创建一个文件

```console
touch css/style.css
```

## 删除一个目录

```console
rmdir dirname
```

## 删除文件或目录

```console
rm filename
```

## 移动或重命名一个目录

```console
mvdir dir1 dir2
```

## 改变文件名或所在目录

```console
mv file1 file2
```

## 显示当前目录的路径名

```console
pwd
```

## 显示或连接文件

```console
cat filename
```

## 复制文件或目录

```console
cp file1 file2
```

## 选择带有 .json 的文件

```console
ls | grep *.json
```
