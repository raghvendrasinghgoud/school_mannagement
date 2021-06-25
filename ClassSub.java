/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_mannagement;

/**
 *
 * @author ragha
 */
abstract public class ClassSub {
    private String Class_id;
    private String Sub_id[];
    /* classSub constructor recieved data from user */
    abstract void ClassSub(String Class_id,String Sub_id);
    /*
    insertClassSub fun will insert the data;
    */
    abstract void insertClassSub(String Class_id,String Sub_id[]);
    /*
    updateClassSub fun updates the subjects of class
    */
    abstract void updateClassSub(String Class_id,String Sub_id[]);
}
