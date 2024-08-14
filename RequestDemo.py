from flask import Flask, render_template,request

app = Flask(__name__)


@app.route("/index", methods=['GET', 'POST'])
def index():
    if request.method=='GET':
        return render_template('index.html')
    if request.method=='POST':
        name=request.form.get('name')
        password=request.form.get('password')
        print(name,password)
        return 'this is post'

if __name__ == "__main__":
    app.run()