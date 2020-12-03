package com.example.demo.config;

import org.apache.shardingsphere.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.hint.HintShardingValue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomHintShardingStrategy implements HintShardingAlgorithm<Integer> {

    @Override
    public Collection<String> doSharding(Collection<String> collection, HintShardingValue<Integer> hintShardingValue) {
        System.out.print("collection: ");
        collection.forEach(i -> System.out.print(i+" "));

        System.out.print("\nhintShardingValue:");
        System.out.print(hintShardingValue.getLogicTableName()+" "+hintShardingValue.getColumnName()+" ");
        hintShardingValue.getValues().forEach(i->System.out.print(i+" "));

        Collection<Integer> c=hintShardingValue.getValues();
        int length=collection.size();
        List<String> result=new ArrayList<>();

        for (String s:collection){
            for (Integer i:c){
                if (s.endsWith(i%length+"")){
                    result.add(s);
                }
            }
        }

        System.out.print("\nresult: ");
        result.forEach(i->System.out.print(i+" "));
        System.out.println();
        return result;
    }
}
