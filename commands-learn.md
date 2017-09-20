����hbase shell
./bin/hbase shell

����ruby�ű�
$ ./bin/hbase org.jruby.Main PATH_TO_SCRIPT

����test����һ������Ϊcf
hbase(main):003:0>create 'test', 'cf'//testΪ������cfΪ������

�鿴���еı�
hbase(main):003:0>list 'table'

Ϊĳ��cell-�С����塢��ȷ��������ֵ
hbase(main):004:0>put 'test', 'row1', 'cf:a', 'value1'//��ֵ��row1�е�cf���������a��

hbase(main):004:0>put 'test', 'row1', 'cf:a', 'value1'//��ֵ��row1�е�cf���������a��

put 'test', 'row3', 'cf:c', 'value3'//��ֵ��row1�е�cf���������c��

ɨ���columnΪ�У�timestampΪʱ�������˵�ǰ汾
hbase(main):007:0>scan 'test'
COLUMN      CELL
cf:a        timestamp=1288380727188, value=value1
1 row(s) in 0.0400 seconds


ɾ������hbase����Ҫ��disableȻ�����ɾ����
hbase(main):012:0>disable 'test'
0 row(s) in 1.0930 seconds
hbase(main):013:0>drop 'test'
0 row(s) in 0.0770 seconds

��hbase shell�н�ת�����ڸ�ʽ
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

shell��debugģʽ
hbase(main):010:0> debug
Debug mode is ON

�����Ҫ��debug��ʱ�򿴵�debug��level��Ϣ������-d����hbase shell
$ ./bin/hbase shell -d


