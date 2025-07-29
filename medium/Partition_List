
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
struct ListNode* partition(struct ListNode* head, int x) {
    
    if(head==NULL){
        return head;
    }
    struct ListNode* smaller_x=create_node(300);
    struct ListNode* bigger_before_x=create_node(300);
    struct ListNode* bigger_after_x=create_node(300);
    struct ListNode* curr1=smaller_x;
    struct ListNode* curr2=bigger_before_x;
    struct ListNode* curr3=bigger_after_x;
    struct ListNode* curr=head;

    while(curr!=NULL && curr->val!=x){
        if(curr->val<x){
            curr1->next=curr;
            curr1=curr1->next;
        }
        else{
            curr2->next=curr;
            curr2=curr2->next;
        }
        curr=curr->next;
    }
    while(curr!=NULL){
        if(curr->val<x){
            curr1->next=curr;
            curr1=curr1->next;
        }
        else if(curr->val>=x){
            curr3->next=curr;
            curr3=curr3->next;
        }
        curr=curr->next;
    }
    
    curr1->next=NULL;
    curr2->next=NULL;
    curr3->next=NULL;
    if(curr2->val==300){
        curr1->next=bigger_after_x->next;
        struct ListNode* last=smaller_x->next;
        free(smaller_x);
        free(bigger_after_x);
        free(bigger_before_x);
        return last;
    }
    if(curr2->val!=300){
        curr2->next=bigger_after_x->next;
        curr1->next=bigger_before_x->next;
        struct ListNode* last=smaller_x->next;
        free(smaller_x);
        free(bigger_after_x);
        free(bigger_before_x);
        return last;
    }
    return head;
    
}