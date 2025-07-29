
 
 struct ListNode {
     int val;
     struct ListNode *next;
 };
 
struct ListNode* create_node(int value){
    struct ListNode* new=malloc(sizeof(struct ListNode));
    new->val=value;
    new->next=NULL;
    return new;
}
struct ListNode* insert_begining(struct ListNode* head,int value){
    struct ListNode* new=create_node(value);
    new->next=head;
    return new;
}
struct ListNode* reverseBetween(struct ListNode* head, int left, int right) {
    
    if(left==right || head==NULL){
        return head;
    }
    struct ListNode* head1=NULL;
    struct ListNode* curr=head;
    struct ListNode* curr2=create_node(700);
    struct ListNode* curr3;
    curr2->next=head;
    int c=1,ok1=0;
    while(curr!=NULL && c<=right){
        if(c>=left && c<=right && left!=right){
            head1=insert_begining(head1,curr->val);
            if(ok1==0){
                curr3=head1;
                ok1=1;
            }
        }
        if(c<left){
            curr2=curr2->next;
        }
        curr=curr->next;
        c++;
    }
    curr3->next=curr;


    if(left!=1){
        curr2->next=head1;
        return head;
    }
    if(left==1){
        curr2=head1;
        return curr2;
    }
    return head;

}