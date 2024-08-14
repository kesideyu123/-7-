from flask import Flask,abort,request,make_response,render_template
app=Flask(__name__)
app.json.ensure_ascii=False
@app.route("/demo",methods=['GET','POST'])
def index():
    if request.method=='GET':
        return render_template('index.html')
    if request.method=='POST':
        name=request.form.get('name')
        password=request.form.get('password')
        if name=='zhangsan'and password=='123':
            return 'login sucess'
        else:
            abort(404)
            return None


#自定义错误处理方法
@app.errorhandler(404)
def handle_404_error(err):
    return render_template('404.html')


if __name__=='__main__':
    app.run()