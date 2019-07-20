#### 为什么这种写法是懒汉式并且JVM能保证到线程安全？

1. 因为内部静态类是要在有引用了以后才会装载到内存的。所以在你第一次调用getInstance()之前，SingletonHolder是没有被装载进来的，只有在你第一次调用了getInstance()之后，里面涉及到了return return SingletonHolder.instance; 产生了对SingletonHolder的引用，内部静态类的实例才会真正装载。这也就是懒加载的意思
2. 线程安全是因为，类加载的初始化阶段是单线程的，类变量的赋值语句在编译生成字节码的时候写在<clinit>函数中，初始化时单线程调用这个<clinit>完成类变量的赋值。
