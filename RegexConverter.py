from flask import Flask
from werkzeug.routing import BaseConverter
app = Flask(__name__)


class RegexConverter(BaseConverter):
    def __int__(self,url_map,regex):
        #调用父类的方法
        super(RegexConverter,self).__int__(url_map)
        self.regex=regex
    def to_python(self,value):
        #父类的方法功能已经实现好了
        print("to_python")
        return value
#将自定义的转换器类添加到flask应用中
app.url_map.converters['re']=RegexConverter


@app.route('/index/<re("1\d{10}"):value>',methods=['GET','POST'])

def index(value):

    return 'hello'


if __name__ == '__main__':
    app.run()