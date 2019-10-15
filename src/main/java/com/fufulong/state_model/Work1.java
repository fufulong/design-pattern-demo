package com.fufulong.state_model;

import lombok.Data;

/**
 * 现在有一个实际场景是这样的,一个程序员在一天之中的根据时间和是否完成当天任务,
 * 还有老板规定的每天9点必须下班,在一天当中程序员有不同的状态
 */
@Data
public class Work1 {
    //工作有2个状态,时间和是否完成了当天的工作量
    private Integer hour;
    private Boolean finished;
    public void workPrograming(){
        //1.当时间在上午9点之前的时候,还没有开始工作
        if (hour < 9){
            System.out.println("现在的时间是:"+hour+"点,没有开始工作");
        }else if (hour < 12){
            //2.当时间在上午9点到上午12点之间的时候,是上午的工作状态,精力比较充沛
            System.out.println("现在的时间是:" + hour + "点,上午工作状态:精力充沛,努力工作");
        }else if(hour < 14){
            //3.中午12点到下午14点之间,是吃饭和午休状态
            System.out.println("现在的时间是:" + hour + "点,是中午的工作状态:吃饭和午休");
        }else if (hour < 18){
            //4.下午14点到下午18点之间,是下午的工作状态
            System.out.println("现在的时间是:" + hour + "点,是下午的工作状态:有点困,坚持工作");
        }else{
            //5.到了18点正常下班点之后,还需要判断是否完成工作和时间是否超过21点
            if(finished){
                //5.1 如果当天的工作做完了,不管几点,都可以下班了
                System.out.println("现在的时间是:" + hour +"点,是否完成工作:" + finished +",下班休息,然后上床睡觉");
            }else if (hour < 21){
                //5.2 如果当天的工作没有做完,且时间不到9点的话,属于加班状态
                System.out.println("现在的时间是:" + hour + "点.是否完成本日工作:"+finished+".现在的工作状态:晚间" +
                        "加班工作,很困,效率低下");
            }else if (hour < 23){
                //5.3 时间在下午21点到23点,回到家中,但是还有上床睡觉
                System.out.println("现在的时间是:" + hour +"点.是否完成本日工作:"+finished+"现在的工作的状态:回到家中,休息,没有工作");
            }else {
                //5.4 时间在晚上23点之后,上床睡觉
                System.out.println("现在的时间是:" + hour + "点.是否完成本如工作:"+finished+"现在的工作状态:没有工作,上床休息,一天结束,晚安");
            }
        }
    }
}
