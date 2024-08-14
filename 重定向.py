from flask import Flask,redirect,url_for
app=Flask(__name__)



@app.route("/index")
def index():
    return redirect("http://www.baidu.com")

@app.route('/demo')
def demo():
    return redirect(url_for("hello"))
@app.route("/")
def hello():
    return 'this is hello fun'


if __name__=='__main__':
    app.run()