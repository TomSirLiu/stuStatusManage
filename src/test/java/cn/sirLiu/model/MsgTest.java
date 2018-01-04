package cn.sirLiu.model;

import cn.sirLiu.model.json.Msg;
import org.junit.Test;

/**
 * @Author sirLiu
 * @Date 2018/1/4 11:26
 */
public class MsgTest {

    @Test
    public void test(){
        Msg msg= Msg.success();
        msg.add("est","agaef").add("Course",new Course(1,"name",2,"w",3));
        System.out.println(msg.toString());
    }

}
