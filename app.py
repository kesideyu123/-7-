from flask import Flask
from werkzeug.routing import BaseConverter
app = Flask(__name__)



#接收不包含斜杠的文本string
#接收正整数int
#接受浮点数float
#接收包含斜线的文本path
@app.route('/hello/<id>',methods=['GET','POST'],endpoint='hello')
def hello_world(id):  # put application's code here
    if id=='1':
        return 'python'
    if id==str(2):
        return 'django'
    if int(id)==3:
        return 'flask'
    return '<h1>Hello World!<h1>'

@app.route('/hi')
def hi():
    return 'hahah'





if __name__ == '__main__':
    app.run()