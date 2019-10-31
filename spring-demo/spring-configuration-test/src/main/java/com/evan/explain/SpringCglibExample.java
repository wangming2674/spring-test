package com.evan.explain;

import com.evan.config.MyConfig;
import com.evan.service.E;
import com.evan.service.F;
//伪代码，写在这里为了方便理解

/**
 * 这里我们已经知道了明确的调用情况，
 * E是直接的创建bean,所以直接调用super.e();
 *
 * F中，调用了E，此时会做一个判断
 * 在spring中，是用ThreadLocal记录当前执行的方法是哪一个，
 * 假设我们当前执行的方法是F().然后执行到F中调用的E().
 * 做判断 当前方法F与E不相符，然后判断E如果存在，直接调用getBean(e),
 * 如果不存在，调用E (实际调用的是父类方法).
 */
public class SpringCglibExample extends MyConfig {
    @Override
    public E e() {
        return super.e();
    }

    @Override
    public F f() {
       /* if (e){
            getBean(e);
        }
        else{
            e();
        } */
        return super.f();
    }
}
