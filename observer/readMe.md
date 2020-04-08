在headfisrt 设计模式中的观察者模式中。作者描述两种类型，一是以“推”的方式；二是以“拉”的方式来建立观察者与被观察者数据的单向传递 。 
      类图以书上为准。
      相同点：
        observe子类在subject子类中的ObserverList进行将自身添加/删除
        subject子类中通知ObserverList中的Observe
      不同点：
      数据单向传递的不同：
1 、 “推”的方式  
         在调用的notifyObserver()中的update(Parameter)方法传递参数。observer“被动”接受来自subject的全部数据 。  
2、  “拉”的方式    
         在调用的Observer中的update()方法,observer“主动”获取subject的对于自身有用的数据。
      subject子类在Observer的作用不同： 
1 、 “推”的方式  
         仅仅使用其作为进行将自身添加/删除的操作
2、  “拉”的方式    
       1、 仅仅使用其作为进行将自身添加/删除的操作
       2、 获取subject的对于自身有用的数据
 
         
         
         
