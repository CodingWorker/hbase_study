运行hbase shell
./bin/hbase shell

运行ruby脚本
$ ./bin/hbase org.jruby.Main PATH_TO_SCRIPT

创建test表，有一个列族为cf
hbase(main):003:0>create 'test', 'cf'//test为表名，cf为列族名

查看所有的表
hbase(main):003:0>list 'table'

为某个cell-行、列族、列确定，设置值
hbase(main):004:0>put 'test', 'row1', 'cf:a', 'value1'//赋值到row1行的cf列族里面的a列

hbase(main):004:0>put 'test', 'row1', 'cf:a', 'value1'//赋值到row1行的cf列族里面的a列

put 'test', 'row3', 'cf:c', 'value3'//赋值到row1行的cf列族里面的c列

扫描表，column为列，timestamp为时间戳或者说是版本
hbase(main):007:0>scan 'test'
COLUMN      CELL
cf:a        timestamp=1288380727188, value=value1
1 row(s) in 0.0400 seconds


删除表，在hbase中需要先disable然后才能删除表
hbase(main):012:0>disable 'test'
0 row(s) in 1.0930 seconds
hbase(main):013:0>drop 'test'
0 row(s) in 0.0770 seconds

在hbase shell中将转换日期格式
hbase(main):021:0> import java.text.SimpleDateFormat
=> Java::JavaText::SimpleDateFormat
hbase(main):022:0> import java.text.ParsePosition
=> Java::JavaText::ParsePosition
hbase(main):023:0> SimpleDateFormat.new("yy/MM/dd HH:mm:ss").parse("08/08/16 20:56:29", ParsePosition.new(0)).getTime() 
=> 1218920189000

hbase(main):008:0> import java.util.Date
file:/home/hbaser/app/hbase-1.2.2/lib/jruby-complete-1.6.8.jar!/builtin/javasupport/core_ext/object.rb:99 warning: already initialized constant Date
=> Java::JavaUtil::Date
hbase(main):009:0> Date.new(1218920189000).toString()
=> "Sat Aug 16 13:56:29 PDT 2008"

shell的debug模式
hbase(main):010:0> debug
Debug mode is ON

如果想要在debug的时候看到debug的level信息，可以-d启动hbase shell
$ ./bin/hbase shell -d


