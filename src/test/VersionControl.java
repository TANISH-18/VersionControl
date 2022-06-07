package test;
import  java.util.*;
public class VersionControl {

    Map<Integer, Set<Integer>> map = new HashMap<>();

    public void addNewVersion(int version, boolean isCompatible){
        map.putIfAbsent(version, new HashSet<>());
        if(isCompatible){
            map.get(version).add(version-1);
        }
    }

    private boolean dfs(int version1, int target){
        if(map.get(version1).contains(target)) return true;

        for(int v : map.get(version1)){
            if(dfs(v, target)) return true;
        }

        return false;
    }

    public boolean isCompatible(int version1, int version2){
        if(version1 == version2) return true;
        else if(version1 < version2) return isCompatible(version2, version1);

        return dfs(version1, version2);
    }


}