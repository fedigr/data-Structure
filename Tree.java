class Tree{
 node left;
 node rigth;
 node root;
  Tree(){
      left = rigth =null;
      root =null;  
  }
// insert new node on this tree
     public void insert(String element){
         node newnode = new node();
         newnode.item = element;
         if(root==null){

            root =newnode;
          }
              else{
                  node curent =root;
                  node parent;
                 while(true){
                     parent =curent;
                     if(element.length()>curent.item.length()){
              curent = curent.left;
              if(curent == null){
                  parent.left= newnode;
                  return;
              }
            }else{
                parent=curent;
                curent =curent.rigth;
                if(curent==null){
                    parent.rigth=newnode;
                    break;
              }
             }
           }
         }
       }
  public void print(node root){
      if(root!=null){
          print(root.rigth);
         System.out.println(root.item);
         print(root.left);
      }
    }
    public void delete(String item){
        
    }
} //end class     


