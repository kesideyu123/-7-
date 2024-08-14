from flask import Flask
import pymysql
pymysql.install_as_MySQLdb()
from flask_sqlalchemy import SQLAlchemy


app=Flask(__name__)
class Config(object):
    SQLALCHEMY_DATABASE_URI = "mysql+pymysql://root:123456@127.0.0.1:3306/flask_demo"
    SQLALCHEMY_TRACK_MODIFICATIONS = True

# 4.将参数传入flask对象
app.config.from_object(Config)
#SQL喝app绑定
db=SQLAlchemy(app)
app.app_context().push()
#创建数据库模型类
class Role(db.Model):
    '''角色表'''
    tablename='role'
    id=db.Column(db.Integer,primary_key=True)#自增长
    name=db.Column(db.String(64),unique=True)#唯一
    def __repr__(self):
        return '%s'%self.name

class User(db.Model):
    '''用户表'''
    tablename='user'
    id=db.Column(db.Integer,primary_key=True)
    name=db.Column(db.String(64),unique=True)
    password=db.Column(db.String(64))
    #表关系 一对多
    role_id=db.Column(db.Integer,db.ForeignKey('role.id'))#外键
    def __repr__(self):
        return '%s'%self.name


if __name__ == '__main__':
    with app.app_context():
        # 清理所有的表
        db.drop_all()
        # 创建所有表
        db.create_all()
        role1 = Role(name='admin')
        # session记录到对象任务中去
        db.session.add(role1)
        role2 = Role(name='admin2')
        # session记录到对象任务中去
        db.session.add(role2)
        role3 = Role(name='admin3')
        # session记录到对象任务中去
        db.session.add(role3)
        # 提交任务
        use1=User(name='zhangsan',password='123',role_id=role1.id)
        use2=User(name='lisi',password='321',role_id=role1.id)
        use3=User(name='wangwu',password='321',role_id=role2.id)
        db.session.add_all([use1,use2,use3])
        db.session.commit()
        app.run()
    pass