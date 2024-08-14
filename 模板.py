from flask  import Flask,render_template
app=Flask(__name__)

@app.route("/demo")
def index():
    data={
        'name':'张三',
        'age':18,
        'mylist':[1,2,3,4,5,6]
    }
    return render_template('index2.html',data=data)


def list_step(li):
    '''
    自定义过滤器
    :return:
    '''
    return li[::2]

# 注册过滤器,第一个写自定义的函数的名字，第二个写你要用时候的名字
app.add_template_filter(list_step,'li2')




if __name__ == '__main__':
    app.run()