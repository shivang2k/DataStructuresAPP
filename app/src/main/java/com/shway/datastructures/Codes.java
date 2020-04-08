package com.shway.datastructures;

public class Codes {

    public final String arr1 = "A[k] = base_address(A) + size_of_element(k – lower_bound)";
    public final String arr2 = "type name[row_size][column_size]";
    public final String arr3 = "type name[row_number][column_number]";
    public final String arr4 = "Address(A[I][J]) = base_address + width {number_of_cols (I – 1) + (J – 1)}";
    public final String arr5 = "Address(A[I][J]) = base_address + width {number_of_rows (J – 1) + (I – 1)}";
    public final String arr6 = "" +
            "void insert_position(int arr[]) {\\n\n" +
            "    int i = 0, pos, num;\n" +
            "    printf(\"Enter the number to be inserted : \");\n" +
            "    scanf(\"%d\", &num);\n" +
            "    printf(\"Enter position at which the number is to be added: \");\n" +
            "    scanf(\"%d\", &pos);\n" +
            "    for (i = n-1; i>= pos; i—)\n" +
            "        arr[i+1] = arr[i];\n" +
            "    arr[pos] = num;\n" +
            "    n = n + 1;\n" +
            "    display_array(arr);\n" +
            "    }";
    public final String arr7 = "void delete_position(int arr[]) {\n" +
            "    int i, pos;\n" +
            "    printf(\"\\nEnter the position from which the number has to be deleted : \");\n" +
            "    scanf(\"%d\", &pos);\n" +
            "    for (i = pos; i < n-1; i++)\n" +
            "        arr[i] = arr[i+1];\n" +
            "    n = n - 1; // decrease total number of used elements\n" +
            "    display_array(arr);\n" +
            "}";
    public final String arr8 = "void display_oneD_array(int arr[100])\n" +
            "{\n" +
            "  int i;\n" +
            "  for(i=0;i < n;i++)\n" +
            "    printf(\"\\n arr[%d] = %d\", i, arr[i]);\n" +
            "}";
    public final String arr9 = "void display_twoD_array(int arr[100][100], int n)\n" +
            "{\n" +
            "  int i,j;\n" +
            "  for(i=0;i < n;i++)\n" +
            "  {\n" +
            "    for(j=0;j < n;j++)\n" +
            "    {\n" +
            "      printf(\"arr[%d][%d] = %d\", i,j, arr[i][j]);\n" +
            "    }\n" +
            "    printf(\"\\n\");\n" +
            "  }\n" +
            "}";

    //SEARCH ARRAY
    public final String arr10 = "int main()\n" +
            "{\n" +
            "  int array[100], search, c, n;\n" +
            "\n" +
            "  printf(\"Enter number of elements in array\\n\");\n" +
            "  scanf(\"%d\", &n);\n" +
            "\n" +
            "  printf(\"Enter %d integer(s)\\n\", n);\n" +
            "\n" +
            "  for (c = 0; c  <  n; c++)\n" +
            "    scanf(\"%d\", &array[c]);\n" +
            "\n" +
            "  printf(\"Enter a number to search\\n\");\n" +
            "  scanf(\"%d\", &search);\n" +
            "\n" +
            "  for (c = 0; c  <  n; c++)\n" +
            "  {\n" +
            "    if (array[c] == search)\n" +
            "    {\n" +
            "      printf(\"%d is present at location %d.\\n\", search, c+1);\n" +
            "      break;\n" +
            "    }\n" +
            "  }\n" +
            "  if (c == n)\n" +
            "    printf(\"%d isn't present in the array.\\n\", search);\n" +
            "\n" +
            "  return 0;\n" +
            "}";

    public final String arr11 = "int main()\n" +
            "{\n" +
            "   int c, first, last, middle, n, search, array[100];\n" +
            "\n" +
            "   printf(\"Enter number of elements\\n\");\n" +
            "   scanf(\"%d\",&n);\n" +
            "\n" +
            "   printf(\"Enter all %d integers in sorted order\\n\", n);\n" +
            "\n" +
            "   for (c = 0; c  <  n; c++)\n" +
            "      scanf(\"%d\",&array[c]);\n" +
            "\n" +
            "   printf(\"Enter value to find\\n\");\n" +
            "   scanf(\"%d\", &search);\n" +
            "\n" +
            "   first = 0;\n" +
            "   last = n - 1;\n" +
            "   middle = (first+last)/2;\n" +
            "\n" +
            "   while (first  <= last) {\n" +
            "      if (array[middle]  <  search)\n" +
            "         first = middle + 1;\n" +
            "      else if (array[middle] == search) {\n" +
            "         printf(\"%d found at location %d.\\n\", search, middle+1);\n" +
            "         break;\n" +
            "      }\n" +
            "      else\n" +
            "         last = middle - 1;\n" +
            "\n" +
            "      middle = (first + last)/2;\n" +
            "   }\n" +
            "   if (first > last)\n" +
            "      printf(\"%d is not found in the array.\\n\", search);\n" +
            "\n" +
            "   return 0;\n" +
            "}";

    //SORT ARRAY

    public final String arr12 = "int main()\n" +
            "{\n" +
            "  int a[20],n,i,j,temp;\n" +
            "  printf(\"Enter the number of elements: \");\n" +
            "  scanf(\"%d\",&n);\n" +
            "  printf(\"Enter the elements: \");\n" +
            "  \n" +
            "  for(i=0;i < n;++i)\n" +
            "    scanf(\"%d\",&a[i]);\n" +
            "      \n" +
            "  for (i = 1; i  <  n; i++)\n" +
            "    for (j = 0; j  <  (n - i); j++)\n" +
            "      if (a[j] > a[j+1])\n" +
            "      {\n" +
            "        temp = a[j];\n" +
            "        a[j] = a[j+1];\n" +
            "        a[j+1] = temp;\n" +
            "      }\n" +
            "          \n" +
            "  printf(\"\\nArray after sorting: \");\n" +
            "  for(i=0;i < n;++i)\n" +
            "    printf(\"%d \",a[i]);\n" +
            "  return 0;\n" +
            "}\n";

    public final String arr13 = "int main()\n" +
            "{\n" +
            "  int data[100],n,temp,i,j;\n" +
            "  printf(\"Enter number of elements to be sorted:\");\n" +
            "  scanf(\"%d\",&n);\n" +
            "  printf(\"Enter elements: \");\n" +
            "  for(i = 0; i  <  n; i++)\n" +
            "    scanf(\"%d\",&data[i]);\n" +
            "  for(i = 1; i  <  n; i++)\n" +
            "  {\n" +
            "    temp = data[i];\n" +
            "    j = i - 1;\n" +
            "    while (temp  <  data[j] && j>=0)\n" +
            "    {\n" +
            "      data[j + 1] = data[j];\n" +
            "      j = j - 1;\n" +
            "    }\n" +
            "    data[j + 1]=temp;\n" +
            "  }\n" +
            "  printf(\"Sorted array: \");\n" +
            "  for(i = 0; i  <  n; i++)\n" +
            "    printf(\"%d  \",data[i]);\n" +
            "  return 0;\n" +
            "}";

    public final String arr14 = "int main()\n" +
            "{\n" +
            "  int array[100], n, pos, temp, i, j;\n" +
            " \n" +
            "  printf(\"Enter number of elements\\n\");\n" +
            "  scanf(\"%d\", &n);\n" +
            " \n" +
            "  printf(\"Enter the %d values\\n\", n);\n" +
            " \n" +
            "  for (i = 0; i  <  n; i++)\n" +
            "    scanf(\"%d\", &array[i]);\n" +
            " \n" +
            "  for (i = 0; i  <  (n - 1); i++)\n" +
            "  {\n" +
            "    pos = i;\n" +
            "    for (j = i + 1; j  <  n; j++)\n" +
            "    {\n" +
            "      if (array[pos] > array[j])\n" +
            "        pos = j;\n" +
            "    }\n" +
            "    if (pos != i)\n" +
            "    {\n" +
            "      temp = array[i];\n" +
            "      array[i] = array[pos];\n" +
            "      array[pos] = temp;\n" +
            "    }\n" +
            "  }\n" +
            " \n" +
            "  printf(\"Sorted list in ascending order:\\n\");\n" +
            "  for (i = 0; i  <  n; i++)\n" +
            "    printf(\"%d\\n\", array[i]);\n" +
            "  return 0;\n" +
            "}";

    public final String arr15 = "void merge(int a[], int i1, int j1, int i2, int j2)\n" +
            "{\n" +
            "  int temp[50];    // temporary array used\n" +
            "  int i, j, k;\n" +
            "  i = i1;          // beginning of the first list\n" +
            "  j = i2;          // beginning of the second list\n" +
            "  k = 0;\n" +
            "\n" +
            "  while (i  <= j1 && j  <= j2)    // while elements in both lists\n" +
            "  {\n" +
            "    if(a[i]  <  a[j])\n" +
            "      temp[k++]=a[i++];\n" +
            "    else\n" +
            "      temp[k++]=a[j++];\n" +
            "  }\n" +
            "\n" +
            "  while(i  <= j1)     // copy remaining elements of the first list\n" +
            "    temp[k++] = a[i++];\n" +
            "\n" +
            "  while(j <=j2)       // copy remaining elements of the second list\n" +
            "    temp[k++]=a[j++];\n" +
            "\n" +
            "  // transfer elements from temp[] back to a[]\n" +
            "  for(i = i1, j = 0; i  <= j2; i++, j++)\n" +
            "      a[i] = temp[j];\n" +
            "}\n" +
            "\n" +
            "void mergesort(int a[], int i, int j)\n" +
            "{\n" +
            "  int mid;\n" +
            "\n" +
            "  if (i  <  j)\n" +
            "  {\n" +
            "    mid = (i+j)/2;\n" +
            "    mergesort(a, i, mid);        //left recursion\n" +
            "    mergesort(a, mid + 1, j);    //right recursion\n" +
            "    merge(a, i, mid, mid + 1 ,j);    //merging of two sorted sub-arrays\n" +
            "  }\n" +
            "}\n" +
            "\n" +
            "int main()\n" +
            "{\n" +
            "  int a[30], n, i;\n" +
            "  printf(\"Enter no of elements:\");\n" +
            "  scanf(\"%d\", &n);\n" +
            "  printf(\"Enter array elements:\");\n" +
            "\n" +
            "  for(i = 0; i  <  n; i++)\n" +
            "    scanf(\"%d\", &a[i]);\n" +
            "\n" +
            "  mergesort(a, 0, n-1);\n" +
            "\n" +
            "  printf(\"\\nSorted array is :\");\n" +
            "\n" +
            "  for(i = 0; i  <  n; i++)\n" +
            "    printf(\"%d \", a[i]);\n" +
            "\n" +
            "  return 0;\n" +
            "}\n";

    public final String arr16 = "void swap(int a, int b) \n" +
            "{ \n" +
            "  int t = a; \n" +
            "  a = b; \n" +
            "  b = t; \n" +
            "} \n" +
            "\n" +
            "int partition (int arr[], int low, int high) \n" +
            "{ \n" +
            "  int pivot = arr[high];    // pivot \n" +
            "  int i = (low - 1);  // index of smaller element \n" +
            "\n" +
            "  for (int j = low; j  <= high- 1; j++) \n" +
            "  { \n" +
            "    // if current element is smaller than the pivot \n" +
            "    if (arr[j]  <  pivot) \n" +
            "    { \n" +
            "      i++;    // increment index of smaller element \n" +
            "      swap(&arr[i], &arr[j]); \n" +
            "    } \n" +
            "  } \n" +
            "  swap(&arr[i + 1], &arr[high]); \n" +
            "  return (i + 1); \n" +
            "} \n" +
            "  \n" +
            "void quick_sort(int arr[], int low, int high) \n" +
            "{ \n" +
            "  if (low  <  high) \n" +
            "  { \n" +
            "    int pi = partition(arr, low, high); \n" +
            "    quick_sort(arr, low, pi - 1);\n" +
            "    quick_sort(arr, pi + 1, high); \n" +
            "  } \n" +
            "} \n" +
            "\n" +
            "int main()\n" +
            "{\n" +
            "  int a[100], n, i;\n" +
            "  printf(\"No. of elements to sort\");\n" +
            "  scanf(\"%d\", &n);\n" +
            "  printf(\"\\nEnter the elements:\\n\");\n" +
            "\n" +
            "  for(i = 0; i  <  n; i++)\n" +
            "    scanf(\"%d\", &a[i]);\n" +
            "\n" +
            "  quick_sort(a, 0, n - 1);\n" +
            "  printf(\"\\nArray after sorting:\");\n" +
            "\n" +
            "  for(i = 0; i  <  n; i++)\n" +
            "    printf(\"%d \",a[i]);\n" +
            "\n" +
            "  return 0;\n" +
            "}";

    //STRUCT
    public final String struct1 = "struct student {\n" +
            "    char name[100];\n" +
            "    int roll_no;\n" +
            "    int age;\n" +
            "}";

    public final String struct2 = "// define variable 'student1' of type 'student'\n" +
            "struct student student1;";

    public final String struct3 = "// access using the dot notation\n" +
            "student1.roll_no = 10;      \n" +
            "student1.age = 20;\n" +
            "strcpy(student1.name,\"Alexa\");\n" +
            "\n" +
            "printf(\"%d\", student1.roll_no);";

    public final String struct4 = "struct Node\n" +
            "{\n" +
            "   int data;\n" +
            "   struct Node *next;     // refers to itself\n" +
            "}  ";

    //LInked List
    public final String ll1 = "struct node\n" +
            "{\n" +
            "  int data;\n" +
            "  struct node *next;\n" +
            "};";
    //sLL
    public final String ll2 = "void insertAtBeginning(int value)\n" +
            "{\n" +
            "   struct Node *newNode;\n" +
            "   newNode = (struct Node*)malloc(sizeof(struct Node));\n" +
            "   newNode -> data = value;\n" +
            "   if(head == NULL)\n" +
            "   {\n" +
            "      newNode -> next = NULL;\n" +
            "      head = newNode;\n" +
            "   }\n" +
            "   else\n" +
            "   {\n" +
            "      newNode -> next = head;\n" +
            "      head = newNode;\n" +
            "   }\n" +
            "   printf(\"\\nNode inserted successfully at beginning\\n\");\n" +
            "}";
    public final String ll3 = "void insertAtEnd(int value)\n" +
            "{\n" +
            "  struct Node *newNode;\n" +
            "  newNode = (struct Node*)malloc(sizeof(struct Node));\n" +
            "  newNode -> data = value;\n" +
            "  newNode -> next = NULL;\n" +
            "  if(head == NULL)\n" +
            "    head = newNode;\n" +
            "  else\n" +
            "  {\n" +
            "    struct Node *temp = head;\n" +
            "    while(temp -> next != NULL)\n" +
            "      temp = temp -> next;\n" +
            "    temp -> next = newNode;\n" +
            "  }\n" +
            "  printf(\"\\nNode inserted successfully at end\\n\");\n" +
            "}";
    public final String ll4 = "void insertPosition(int value, int pos)\n" +
            "{\n" +
            "  int i = 0;\n" +
            "  struct Node *newNode;\n" +
            "  newNode = (struct Node*)malloc(sizeof(struct Node));\n" +
            "  newNode -> data = value;\n" +
            "  if(head == NULL)\n" +
            "  {\n" +
            "    newNode -> next = NULL;\n" +
            "    head = newNode;\n" +
            "  }\n" +
            "  else {\n" +
            "    struct Node *temp = head;\n" +
            "    for (i = 0; i  <  pos - 1; i++) {\n" +
            "      temp = temp -> next;\n" +
            "    }\n" +
            "    newNode -> next = temp -> next;\n" +
            "    temp -> next = newNode;\n" +
            "  }\n" +
            "  printf(\"\\nNode inserted successfully\\n\");\n" +
            "}";
    public final String ll5 = "void removeBeginning()\n" +
            "{\n" +
            "  if (head == NULL)\n" +
            "\t  printf(\"\\n\\nList is already Empty!\");\n" +
            "    else\n" +
            "    {\n" +
            "      struct Node *temp = head;\n" +
            "      if (head -> next == NULL)\n" +
            "      {\n" +
            "\t      head = NULL;\n" +
            "\t      free(temp);\n" +
            "      }\n" +
            "      else\n" +
            "      {\n" +
            "        head = temp -> next;\n" +
            "        free(temp);\n" +
            "        printf(\"\\nNode deleted at the beginning\\n\\n\");\n" +
            "      }\n" +
            "   }\n" +
            "}\n";
    public final String ll6 = "void removeEnd()\n" +
            "{\n" +
            "  if(head == NULL)\n" +
            "  {\n" +
            "    printf(\"\\nList is Empty\\n\");\n" +
            "  }\n" +
            "  else\n" +
            "  {\n" +
            "    struct Node *temp1 = head, *temp2;\n" +
            "    if(head -> next == NULL)\n" +
            "      head = NULL;\n" +
            "    else\n" +
            "    {\n" +
            "      while(temp1 -> next != NULL)\n" +
            "      {\n" +
            "        temp2 = temp1;\n" +
            "        temp1 = temp1 -> next;\n" +
            "      }\n" +
            "      temp2 -> next = NULL;\n" +
            "    }\n" +
            "    free(temp1);\n" +
            "    printf(\"\\nNode deleted at the end\\n\\n\");\n" +
            "  }\n" +
            "}";
    public final String ll7 = "void removePosition(int pos)\n" +
            "{\n" +
            "  int i, flag = 0;\n" +
            "  struct Node *temp1 = head, *temp2;\n" +
            "  if (pos == 1) {\n" +
            "      head = temp1 -> next;\n" +
            "      free(temp1);\n" +
            "      printf(\"\\nNode deleted\\n\\n\");\n" +
            "  }\n" +
            "  else {\n" +
            "    for (i = 0; i  <  pos - 1; i++)\n" +
            "    {\n" +
            "      if (temp1 -> next != NULL) {\n" +
            "        temp2 = temp1;\n" +
            "        temp1 = temp1 -> next;\n" +
            "      }\n" +
            "      else {\n" +
            "        flag = 1;\n" +
            "        break;\n" +
            "      }\n" +
            "    }\n" +
            "    if (flag == 0) {\n" +
            "      temp2 -> next = temp1 -> next;\n" +
            "      free(temp1);\n" +
            "      printf(\"\\nNode deleted\\n\\n\");\n" +
            "    }\n" +
            "    else {\n" +
            "      printf(\"Position exceeds linked list. Please try again\");\n" +
            "    }\n" +
            "  }\n" +
            "}\n";
    public final String ll8 = "void main()\n" +
            "{\n" +
            "  int choice, value, choice1, pos, del;\n" +
            "  while(1) {\n" +
            "  printf(\"\\n\\n------ MENU ------\\n\");\n" +
            "  printf(\"1. Insert at beginning\\n2. Insert at End\\n3. Insert at location\\n4. Delete at beginning\\n5. Delete at End\\n6. Delete at location\\n7. Display\\n8. Exit\\n\\nEnter your choice:  \");\n" +
            "  scanf(\"%d\", &choice);\n" +
            "  switch(choice)\n" +
            "  {\n" +
            "    case 1: printf(\"Enter the value to be insert: \");\n" +
            "            scanf(\"%d\", &value);\n" +
            "            insertAtBeginning(value);\n" +
            "            break;\n" +
            "    case 2: printf(\"Enter the value to be insert: \");\n" +
            "            scanf(\"%d\", &value);\n" +
            "            insertAtEnd(value);\n" +
            "            break;\n" +
            "    case 3: printf(\"Enter the value to be insert: \");\n" +
            "            scanf(\"%d\", &value);\n" +
            "            printf(\"Enter the position after which you want to insert: \");\n" +
            "            scanf(\"%d\", &pos);\n" +
            "            insertPosition(value, pos);\n" +
            "            break;\n" +
            "    case 4: removeBeginning();\n" +
            "            break;\n" +
            "    case 5: removeEnd();\n" +
            "            break;\n" +
            "    case 6: printf(\"Enter the value which you want to delete: \");\n" +
            "            scanf(\"%d\", &pos);\n" +
            "            removePosition(pos);\n" +
            "            break;\n" +
            "    case 7: display();\n" +
            "            break;\n" +
            "    case 8: exit(0);\n" +
            "    default: printf(\"\\nWrong Input. Please try again!\\n\\n\");\n" +
            "    }\n" +
            "  }\n" +
            "}";

    //DLL
    public final String ll9 = "void insertAtBeginning(int value)\n" +
            "{\n" +
            "  struct Node *newNode;\n" +
            "  newNode = (struct Node*)malloc(sizeof(struct Node));\n" +
            "  newNode -> data = value;\n" +
            "  newNode -> previous = NULL;\n" +
            "  if(head == NULL)\n" +
            "  {\n" +
            "    newNode -> next = NULL;\n" +
            "    head = newNode;\n" +
            "  }\n" +
            "  else\n" +
            "  {\n" +
            "    newNode -> next = head;\n" +
            "    head -> previous = newNode;\n" +
            "    head = newNode;\n" +
            "  }\n" +
            "  printf(\"\\nInsertion successful\");\n" +
            "}";
    public final String ll10 = "void insertAtEnd(int value)\n" +
            "{\n" +
            "  struct Node *newNode;\n" +
            "  newNode = (struct Node*)malloc(sizeof(struct Node));\n" +
            "  newNode -> data = value;\n" +
            "  newNode -> next = NULL;\n" +
            "  if(head == NULL)\n" +
            "  {\n" +
            "    newNode -> previous = NULL;\n" +
            "    head = newNode;\n" +
            "  }\n" +
            "  else\n" +
            "  {\n" +
            "    struct Node *temp = head;\n" +
            "    while(temp -> next != NULL)\n" +
            "      temp = temp -> next;\n" +
            "    temp -> next = newNode;\n" +
            "    newNode -> previous = temp;\n" +
            "  }\n" +
            "  printf(\"\\nInsertion successful\");\n" +
            "}";
    public final String ll11 = "void insertAfter(int value, int pos)\n" +
            "{\n" +
            "  int i, flag = 1;\n" +
            "  struct Node *newNode, *temp = head;\n" +
            "  newNode = (struct Node*)malloc(sizeof(struct Node));\n" +
            "  newNode -> data = value;\n" +
            "  if(head == NULL)\n" +
            "  {\n" +
            "    newNode -> previous = newNode -> next = NULL;\n" +
            "    head = newNode;\n" +
            "  }\n" +
            "  else\n" +
            "  {\n" +
            "  for (i = 0; i  <  pos - 1; i++) {\n" +
            "    temp = temp -> next;\n" +
            "    if (temp -> next == NULL) {\n" +
            "      flag = 0;\n" +
            "      break;\n" +
            "    }\n" +
            "  }\n" +
            "\n" +
            "  if (flag) {\n" +
            "    newNode -> next = temp -> next;\n" +
            "    temp -> next -> previous = newNode;\n" +
            "    temp -> next = newNode;\n" +
            "    newNode -> previous = temp;\n" +
            "    printf(\"\\nInsertion successful\\n\");\n" +
            "  }\n" +
            "  else\n" +
            "    printf(\"Number of elements is less than position entered\");\n" +
            "  }\n" +
            "}\n";
    public final String ll12 = "void deleteBeginning()\n" +
            "{\n" +
            "  if(head == NULL)\n" +
            "    printf(\"List is Empty\");\n" +
            "  else\n" +
            "  {\n" +
            "    struct Node *temp = head;\n" +
            "    if(temp -> previous == temp -> next) {\n" +
            "      head = NULL;\n" +
            "      free(temp);\n" +
            "    }\n" +
            "    else {\n" +
            "      head = temp -> next;\n" +
            "      head -> previous = NULL;\n" +
            "      free(temp);\n" +
            "    }\n" +
            "    printf(\"\\nDeletion successful\");\n" +
            "  }\n" +
            "}";
    public final String ll13 = "void deleteEnd()\n" +
            "{\n" +
            "  if(head == NULL)\n" +
            "    printf(\"List is Empty\");\n" +
            "  else\n" +
            "  {\n" +
            "    struct Node *temp = head;\n" +
            "    if(temp -> previous == temp -> next) {\n" +
            "      head = NULL;\n" +
            "      free(temp);\n" +
            "    }\n" +
            "    else {\n" +
            "      while(temp -> next != NULL)\n" +
            "        temp = temp -> next;\n" +
            "      temp -> previous -> next = NULL;\n" +
            "      free(temp);\n" +
            "    }\n" +
            "    printf(\"\\nDeletion successful\");\n" +
            "  }\n" +
            "}\n";
    public final String ll14 = "void deleteSpecific(int delValue)\n" +
            "{\n" +
            "  if(head == NULL)\n" +
            "    printf(\"List is Empty\");\n" +
            "  else\n" +
            "  {\n" +
            "    struct Node *temp = head;\n" +
            "    while(temp -> data != delValue)\n" +
            "    {\n" +
            "      if(temp -> next == NULL)\n" +
            "      {\n" +
            "        printf(\"\\nGiven node is not found in the list\");\n" +
            "      }\n" +
            "      else\n" +
            "      {\n" +
            "        temp = temp -> next;\n" +
            "      }\n" +
            "    }\n" +
            "    if(temp == head)\n" +
            "    {\n" +
            "      head = NULL;\n" +
            "      free(temp);\n" +
            "    }\n" +
            "    else\n" +
            "    {\n" +
            "      temp -> previous -> next = temp -> next;\n" +
            "      free(temp);\n" +
            "    }\n" +
            "    printf(\"\\nDeletion successful\");\n" +
            "  }\n" +
            "}\n";
    public final String ll15 = "void main()\n" +
            "{\n" +
            "  int choice, value, pos;\n" +
            "  while(1)\n" +
            "  {\n" +
            "    printf(\"\\nDoubly Linked List Operations\\n\");\n" +
            "    printf(\"1. Insert at beginning\\n2. Insert at End\\n3. Insert at location\\n4. Delete at beginning\\n5. Delete at End\\n6. Delete specific node\\n7. Display\\n8. Exit\\n\\nEnter your choice:  \");\n" +
            "    scanf(\"%d\",&choice);\n" +
            "    switch(choice)\n" +
            "    {\n" +
            "      case 1: printf(\"Enter the value to be inserted: \");\n" +
            "              scanf(\"%d\",&value);\n" +
            "              insertAtBeginning(value);\n" +
            "              break;\n" +
            "      case 2: printf(\"Enter the value to be inserted: \");\n" +
            "              scanf(\"%d\",&value);\n" +
            "              insertAtEnd(value);\n" +
            "              break;\n" +
            "      case 3: printf(\"Enter the value to be inserted: \");\n" +
            "              scanf(\"%d\",&value);\n" +
            "              printf(\"Enter the position after which you want to insert: \");\n" +
            "              scanf(\"%d\",&pos);\n" +
            "              insertAfter(value,pos);\n" +
            "              break;\n" +
            "      case 4: deleteBeginning();\n" +
            "              break;\n" +
            "      case 5: deleteEnd();\n" +
            "              break;\n" +
            "      case 6: printf(\"Enter the Node value to be deleted: \");\n" +
            "              scanf(\"%d\",&pos);\n" +
            "              deleteSpecific(pos);\n" +
            "              break;\n" +
            "      case 7: display();\n" +
            "              break;\n" +
            "      case 8: exit(0);\n" +
            "      default: printf(\"\\nWrong choice. Please try again\\n\");\n" +
            "    }\n" +
            "  }\n" +
            "}\n";

    //CLL
    public final String ll16 = "void insertAtBeginning(int value)\n" +
            "{\n" +
            "  struct Node *newNode;\n" +
            "  newNode = (struct Node*)malloc(sizeof(struct Node));\n" +
            "  newNode -> data = value;\n" +
            "  if(head == NULL)\n" +
            "  {\n" +
            "    head = newNode;\n" +
            "    newNode -> next = head;\n" +
            "  }\n" +
            "  else\n" +
            "  {\n" +
            "    struct Node *temp = head;\n" +
            "    while(temp -> next != head)\n" +
            "      temp = temp -> next;\n" +
            "    newNode -> next = head;\n" +
            "    head = newNode;\n" +
            "    temp -> next = head;\n" +
            "  }\n" +
            "  printf(\"\\nInsertion successful\");\n" +
            "}";
    public final String ll17 = "void insertAtEnd(int value)\n" +
            "{\n" +
            "  struct Node *newNode;\n" +
            "  newNode = (struct Node*)malloc(sizeof(struct Node));\n" +
            "  newNode -> data = value;\n" +
            "  if(head == NULL)\n" +
            "  {\n" +
            "    head = newNode;\n" +
            "    newNode -> next = head;\n" +
            "  }\n" +
            "  else\n" +
            "  {\n" +
            "    struct Node *temp = head;\n" +
            "    while(temp -> next != head)\n" +
            "      temp = temp -> next;\n" +
            "    temp -> next = newNode;\n" +
            "    newNode -> next = head;\n" +
            "  }\n" +
            "  printf(\"\\nInsertion successful\");\n" +
            "}";
    public final String ll18 = "void insertAfter(int value, int location)\n" +
            "{\n" +
            "  struct Node *newNode;\n" +
            "  newNode = (struct Node*)malloc(sizeof(struct Node));\n" +
            "  newNode -> data = value;\n" +
            "  if(head == NULL)\n" +
            "  {\n" +
            "    head = newNode;\n" +
            "    newNode -> next = head;\n" +
            "  }\n" +
            "  else\n" +
            "  {\n" +
            "    struct Node *temp = head;\n" +
            "    while(temp -> data != location)\n" +
            "    {\n" +
            "      if(temp -> next == head)\n" +
            "      {\n" +
            "        printf(\"Given node is not found in the list\");\n" +
            "      }\n" +
            "      else\n" +
            "      {\n" +
            "        temp = temp -> next;\n" +
            "      }\n" +
            "    }\n" +
            "    newNode -> next = temp -> next;\n" +
            "    temp -> next = newNode;\n" +
            "    printf(\"\\nInsertion successful\");\n" +
            "  }\n" +
            "}";
    public final String ll19 = "void deleteBeginning()\n" +
            "{\n" +
            "  if(head == NULL)\n" +
            "    printf(\"List is Empty\");\n" +
            "  else\n" +
            "  {\n" +
            "    struct Node *temp = head, *last = NULL;\n" +
            "    if(temp -> next == head)\n" +
            "    {\n" +
            "      head = NULL;\n" +
            "      free(temp);\n" +
            "    }\n" +
            "    else{\n" +
            "      while(temp -> next != head)\n" +
            "        temp = temp -> next;\n" +
            "      last = temp;\n" +
            "      temp = head;\n" +
            "      head = head -> next;\n" +
            "      free(temp);\n" +
            "      last -> next = head;\n" +
            "    }\n" +
            "    printf(\"\\nDeletion successful\");\n" +
            "  }\n" +
            "}";
    public final String ll20 = "void deleteBeginning()\n" +
            "{\n" +
            "  if(head == NULL)\n" +
            "    printf(\"List is Empty\");\n" +
            "  else\n" +
            "  {\n" +
            "    struct Node *temp = head, *last = NULL;\n" +
            "    if(temp -> next == head)\n" +
            "    {\n" +
            "      head = NULL;\n" +
            "      free(temp);\n" +
            "    }\n" +
            "    else{\n" +
            "      while(temp -> next != head)\n" +
            "        temp = temp -> next;\n" +
            "      last = temp;\n" +
            "      temp = head;\n" +
            "      head = head -> next;\n" +
            "      free(temp);\n" +
            "      last -> next = head;\n" +
            "    }\n" +
            "    printf(\"\\nDeletion successful\");\n" +
            "  }\n" +
            "}";
    public final String ll21 = "void deleteSpecific(int delValue)\n" +
            "{\n" +
            "  if(head == NULL)\n" +
            "    printf(\"List is Empty\");\n" +
            "  else\n" +
            "  {\n" +
            "    struct Node *temp1 = head, *temp2;\n" +
            "    while(temp1 -> data != delValue)\n" +
            "    {\n" +
            "      if(temp1 -> next == head)\n" +
            "      {\n" +
            "        printf(\"\\nGiven node is not found in the list\");\n" +
            "      }\n" +
            "      else\n" +
            "      {\n" +
            "        temp2 = temp1;\n" +
            "        temp1 = temp1 -> next;\n" +
            "      }\n" +
            "    }\n" +
            "    if (temp1 -> next == head) {\n" +
            "      head = NULL;\n" +
            "      free(temp1);\n" +
            "    }\n" +
            "    else {\n" +
            "      if(temp1 == head)\n" +
            "      {\n" +
            "        temp2 = head;\n" +
            "        while(temp2 -> next != head)\n" +
            "            temp2 = temp2 -> next;\n" +
            "        head = head -> next;\n" +
            "        temp2 -> next = head;\n" +
            "        free(temp1);\n" +
            "      }\n" +
            "      else\n" +
            "      {\n" +
            "        if(temp1 -> next == head)\n" +
            "        {\n" +
            "          temp2 -> next = head;\n" +
            "        }\n" +
            "        else\n" +
            "        {\n" +
            "          temp2 -> next = temp1 -> next;\n" +
            "        }\n" +
            "        free(temp1);\n" +
            "      }\n" +
            "    }\n" +
            "    printf(\"\\nDeletion successful\");\n" +
            "  }\n" +
            "}\n";
    public final String ll22 = "void main()\n" +
            "{\n" +
            "  int choice,value,choice1,pos,del;\n" +
            "  while(1) {\n" +
            "    printf(\"\\n\\nCircular Linked List Menu\\n\");\n" +
            "    printf(\"1. Insert at beginning\\n2. Insert at End\\n3. Insert at location\\n4. Delete at beginning\\n5. Delete at End\\n6. Delete at location\\n7. Display\\n8. Exit\\n\\nEnter your choice:  \");\n" +
            "    scanf(\"%d\",&choice);\n" +
            "    switch(choice)\n" +
            "    {\n" +
            "      case 1: printf(\"Enter the value to be insert: \");\n" +
            "              scanf(\"%d\", &value);\n" +
            "              insertAtBeginning(value);\n" +
            "              break;\n" +
            "      case 2: printf(\"Enter the value to be insert: \");\n" +
            "              scanf(\"%d\", &value);\n" +
            "              insertAtEnd(value);\n" +
            "              break;\n" +
            "      case 3: printf(\"Enter the value to be insert: \");\n" +
            "              scanf(\"%d\", &value);\n" +
            "              printf(\"Enter the element after which you want to insert: \");\n" +
            "              scanf(\"%d\", &pos);\n" +
            "              insertAfter(value, pos);\n" +
            "              break;\n" +
            "      case 4: deleteBeginning();\n" +
            "              break;\n" +
            "      case 5: deleteEnd();\n" +
            "              break;\n" +
            "      case 6: printf(\"Enter the element after which you want to delete: \");\n" +
            "              scanf(\"%d\", &pos);\n" +
            "              deleteSpecific(pos);\n" +
            "              break;\n" +
            "      case 7: display();\n" +
            "              break;\n" +
            "      case 8: exit(0);\n" +
            "      default: printf(\"\\nWrong Choice\\n\\n\");\n" +
            "    }\n" +
            "  }\n" +
            "}\n" +
            "\n" +
            "\n";
//STACK

    public final String s1 = "void push(int value){\n" +
            "  if(top == SIZE-1)\n" +
            "    printf(\"\\nOverflow. Stack is Full\");\n" +
            "  else{\n" +
            "    top++;\n" +
            "    stack[top] = value;\n" +
            "    printf(\"\\nInsertion was successful\");\n" +
            "  }\n" +
            "}\n";
    public final String s2 = "void pop(){\n" +
            "  if(top == -1)\n" +
            "    printf(\"\\nUnderflow. Stack is empty\");\n" +
            "  else{\n" +
            "    printf(\"\\nDeleted : %d\", stack[top]);\n" +
            "    top--;\n" +
            "  }\n" +
            "}";
    public final String s3 = "int stack[SIZE], top = -1;\n" +
            "\n" +
            "void push(int value) {\n" +
            "  if(top == SIZE-1)\n" +
            "    printf(\"\\nOverflow. Stack is Full\");\n" +
            "  else{\n" +
            "    top++;\n" +
            "    stack[top] = value;\n" +
            "    printf(\"\\nInsertion was successful\");\n" +
            "  }\n" +
            "}\n" +
            "\n" +
            "void pop() {\n" +
            "  if(top == -1)\n" +
            "    printf(\"\\nUnderflow. Stack is empty\");\n" +
            "  else{\n" +
            "    printf(\"\\nDeleted : %d\", stack[top]);\n" +
            "    top--;\n" +
            "  }\n" +
            "}\n" +
            "\n" +
            "void display() {\n" +
            "  if(top == -1)\n" +
            "    printf(\"\\nStack is Empty!\");\n" +
            "  else{\n" +
            "    int i;\n" +
            "    printf(\"\\nStack elements are:\\n\");\n" +
            "    for(i=top; i>=0; i--)\n" +
            "  printf(\"%d\\n\",stack[i]);\n" +
            "  }\n" +
            "}\n" +
            "\n" +
            "void main()\n" +
            "{\n" +
            "  int value, choice;\n" +
            "  while(1) {\n" +
            "    printf(\"\\n\\n------MENU-------\\n\");\n" +
            "    printf(\"1. Push\\n2. Pop\\n3. Display\\n4. Exit\");\n" +
            "    printf(\"\\nEnter your choice: \");\n" +
            "    scanf(\"%d\",&choice);\n" +
            "    switch(choice){\n" +
            "      case 1: printf(\"Enter the value to be inserted: \");\n" +
            "              scanf(\"%d\",&value);\n" +
            "              push(value);\n" +
            "              break;\n" +
            "      case 2: pop();\n" +
            "              break;\n" +
            "      case 3: display();\n" +
            "              break;\n" +
            "      case 4: exit(0);\n" +
            "      default: printf(\"\\nWrong selection, please try again.\");\n" +
            "    }\n" +
            "  }\n" +
            "}";

    //StackLL
    public final String s4 = "void push(int value)\n" +
            "{\n" +
            "  struct Node *newNode;\n" +
            "  newNode = (struct Node*)malloc(sizeof(struct Node));\n" +
            "  newNode -> data = value;\n" +
            "  if(top == NULL)\n" +
            "    newNode -> next = NULL;\n" +
            "  else\n" +
            "    newNode -> next = top;\n" +
            "  top = newNode;\n" +
            "  printf(\"\\nInsertion is Successful\\n\");\n" +
            "}\n";
    public final String s5 = "void pop()\n" +
            "{\n" +
            "  if (top == NULL)\n" +
            "    printf(\"\\nUnderflow. Stack is empty\\n\");\n" +
            "  else {\n" +
            "    struct Node *temp = top;\n" +
            "    printf(\"\\nDeleted element is: %d\", temp -> data);\n" +
            "    top = temp -> next;\n" +
            "    free(temp);\n" +
            "  }\n" +
            "}";
    public final String s6 = "struct Node\n" +
            "{\n" +
            "  int data;\n" +
            "  struct Node *next;\n" +
            "}*top = NULL;\n" +
            "\n" +
            "void push(int value)\n" +
            "{\n" +
            "  struct Node *newNode;\n" +
            "  newNode = (struct Node*)malloc(sizeof(struct Node));\n" +
            "  newNode -> data = value;\n" +
            "  if (top == NULL)\n" +
            "    newNode -> next = NULL;\n" +
            "  else\n" +
            "    newNode -> next = top;\n" +
            "  top = newNode;\n" +
            "  printf(\"\\nInsertion is Successful\\n\");\n" +
            "}\n" +
            "\n" +
            "void pop()\n" +
            "{\n" +
            "  if(top == NULL)\n" +
            "    printf(\"\\nUnderflow. Stack is empty\\n\");\n" +
            "  else {\n" +
            "    struct Node *temp = top;\n" +
            "    printf(\"\\nDeleted element is: %d\", temp -> data);\n" +
            "    top = temp -> next;\n" +
            "    free(temp);\n" +
            "  }\n" +
            "}\n" +
            "\n" +
            "void display()\n" +
            "{\n" +
            "  if(top == NULL)\n" +
            "    printf(\"\\nStack is Empty\\n\");\n" +
            "  else {\n" +
            "    struct Node *temp = top;\n" +
            "    while (temp -> next != NULL){\n" +
            "      printf(\"%d--->\", temp -> data);\n" +
            "      temp = temp -> next;\n" +
            "    }\n" +
            "    printf(\"%d--->NULL\", temp -> data);\n" +
            "  }\n" +
            "}\n" +
            "\n" +
            "void main()\n" +
            "{\n" +
            "  int choice, value;\n" +
            "  printf(\"\\nStack using Linked ListS\\n\");\n" +
            "  while(1) {\n" +
            "    printf(\"\\nStack using Linked Lists\\n\");\n" +
            "    printf(\"1. Push\\n2. Pop\\n3. Display\\n4. Exit\\n\");\n" +
            "    printf(\"Enter your choice: \");\n" +
            "    scanf(\"%d\", &choice);\n" +
            "    switch(choice){\n" +
            "    case 1: printf(\"Enter the value to be inserted: \");\n" +
            "            scanf(\"%d\", &value);\n" +
            "            push(value);\n" +
            "            break;\n" +
            "    case 2: pop();\n" +
            "            break;\n" +
            "    case 3: display();\n" +
            "            break;\n" +
            "    case 4: exit(0);\n" +
            "    default: printf(\"\\nWrong selection, Please try again\\n\");\n" +
            "    }\n" +
            "  }\n" +
            "}\n";

//QUEUE
    public final String q1 = "void enQueue(int value){\n" +
        "  if(rear == SIZE-1)\n" +
        "    printf(\"\\nOverflow. Queue is Full.\");\n" +
        "  else {\n" +
        "    if(front == -1)\n" +
        "  front = 0;\n" +
        "    rear++;\n" +
        "    queue[rear] = value;\n" +
        "    printf(\"\\nInsertion was successful\");\n" +
        "  }\n" +
        "}";
    public final String q2 = "void deQueue() {\n" +
            "  if (front == rear)\n" +
            "    printf(\"\\nUnderflow. Queue is Empty.\");\n" +
            "  else {\n" +
            "    printf(\"\\nDeleted item is: %d\", queue[front]);\n" +
            "    front++;\n" +
            "    if (front == rear)\n" +
            "      front = rear = -1;\n" +
            "  }\n" +
            "}";
    public final String q3 = "int queue[SIZE], front = -1, rear = -1;\n" +
            "\n" +
            "void enQueue(int value) {\n" +
            "  if(rear == SIZE - 1)\n" +
            "    printf(\"\\nOverflow. Queue is Full.\");\n" +
            "  else {\n" +
            "    if (front == -1)\n" +
            "  front = 0;\n" +
            "    rear++;\n" +
            "    queue[rear] = value;\n" +
            "    printf(\"\\nInsertion was successful\");\n" +
            "  }\n" +
            "}\n" +
            "\n" +
            "void deQueue() {\n" +
            "  if (front == rear)\n" +
            "    printf(\"\\nUnderflow. Queue is Empty.\");\n" +
            "  else {\n" +
            "    printf(\"\\nDeleted item is: %d\", queue[front]);\n" +
            "    front++;\n" +
            "    if (front == rear)\n" +
            "      front = rear = -1;\n" +
            "  }\n" +
            "}\n" +
            "\n" +
            "void display() {\n" +
            "  if(rear == -1)\n" +
            "    printf(\"\\nQueue is Empty!\");\n" +
            "  else {\n" +
            "    int i;\n" +
            "    printf(\"\\nQueue elements are:\\n\");\n" +
            "    for (i = front; i <=rear; i++)\n" +
            "      printf(\"%d\\t\",queue[i]);\n" +
            "  }\n" +
            "}\n" +
            "\n" +
            "void main()\n" +
            "{\n" +
            "  int value, choice;\n" +
            "  while(1) {\n" +
            "    printf(\"\\n----- Queue Using Arrays-----\\n\");\n" +
            "    printf(\"1. Insertion\\n2. Deletion\\n3. Display\\n4. Exit\");\n" +
            "    printf(\"\\nEnter your choice: \");\n" +
            "    scanf(\"%d\",&choice);\n" +
            "    switch(choice) {\n" +
            "      case 1: printf(\"Enter the value to be inserted: \");\n" +
            "              scanf(\"%d\",&value);\n" +
            "              enQueue(value);\n" +
            "              break;\n" +
            "      case 2: deQueue();\n" +
            "              break;\n" +
            "      case 3: display();\n" +
            "              break;\n" +
            "      case 4: exit(0);\n" +
            "      default: printf(\"\\nWrong selection, please try again\");\n" +
            "    }\n" +
            "  }\n" +
            "}";

    //QUEUE LL
    public final String q4 = "void enQueue(int value)\n" +
            "{\n" +
            "  struct Node *newNode;\n" +
            "  newNode = (struct Node*)malloc(sizeof(struct Node));\n" +
            "  newNode -> data = value;\n" +
            "  newNode -> next = NULL;\n" +
            "  if (front == NULL)\n" +
            "    front = rear = newNode;\n" +
            "  else {\n" +
            "    rear -> next = newNode;\n" +
            "    rear = newNode;\n" +
            "  }\n" +
            "  printf(\"\\nInsertion is Successful\\n\");\n" +
            "}\n";
    public final String q5 = "void deQueue()\n" +
            "{\n" +
            "   if (front == NULL)\n" +
            "      printf(\"\\nUnderflow. Queue is Empty\\n\");\n" +
            "   else {\n" +
            "      struct Node *temp = front;\n" +
            "      front = front -> next;\n" +
            "      printf(\"\\nDeleted element: %d\\n\", temp -> data);\n" +
            "      free(temp);\n" +
            "   }\n" +
            "}";
    public final String q6 = "struct Node\n" +
            "{\n" +
            "   int data;\n" +
            "   struct Node *next;\n" +
            "}*front = NULL, *rear = NULL;\n" +
            "\n" +
            "void enQueue(int value)\n" +
            "{\n" +
            "  struct Node *newNode;\n" +
            "  newNode = (struct Node*)malloc(sizeof(struct Node));\n" +
            "  newNode -> data = value;\n" +
            "  newNode -> next = NULL;\n" +
            "  if (front == NULL)\n" +
            "    front = rear = newNode;\n" +
            "  else {\n" +
            "    rear -> next = newNode;\n" +
            "    rear = newNode;\n" +
            "  }\n" +
            "  printf(\"\\nInsertion is Successful\\n\");\n" +
            "}\n" +
            "\n" +
            "void deQueue()\n" +
            "{\n" +
            "  if (front == NULL)\n" +
            "    printf(\"\\nUnderflow. Queue is Empty\\n\");\n" +
            "  else\n" +
            "  {\n" +
            "    struct Node *temp = front;\n" +
            "    front = front -> next;\n" +
            "    printf(\"\\nDeleted element: %d\\n\", temp -> data);\n" +
            "    free(temp);\n" +
            "  }\n" +
            "}\n" +
            "\n" +
            "void display()\n" +
            "{\n" +
            "  if (front == NULL)\n" +
            "    printf(\"\\nQueue is Empty!\\n\");\n" +
            "  else {\n" +
            "    struct Node *temp = front;\n" +
            "    while (temp -> next != NULL) {\n" +
            "      printf(\"%d--->\", temp -> data);\n" +
            "      temp = temp -> next;\n" +
            "    }\n" +
            "    printf(\"%d--->NULL\\n\", temp -> data);\n" +
            "  }\n" +
            "}\n" +
            "\n" +
            "void main()\n" +
            "{\n" +
            "  int choice, value;\n" +
            "  while(1) {\n" +
            "    printf(\"\\nQueue using Linked List\\n\");\n" +
            "    printf(\"1. Insert\\n2. Delete\\n3. Display\\n4. Exit\\n\");\n" +
            "    printf(\"Enter your choice: \");\n" +
            "    scanf(\"%d\", &choice);\n" +
            "    switch(choice) {\n" +
            "      case 1: printf(\"Enter the value to be inserted: \");\n" +
            "              scanf(\"%d\", &value);\n" +
            "              enQueue(value);\n" +
            "              break;\n" +
            "      case 2: deQueue();\n" +
            "              break;\n" +
            "      case 3: display();\n" +
            "              break;\n" +
            "      case 4: exit(0);\n" +
            "      default: printf(\"\\nWrong choice. Please try again\\n\");\n" +
            "    }\n" +
            "  }\n" +
            "}";

    //BST
    public final String bst = "struct node\n" +
            "{\n" +
            "  int data;\n" +
            "  struct node* left;\n" +
            "  struct node* right;\n" +
            "};\n" +
            "\n" +
            "struct node* createNode(value) {\n" +
            "  struct node* newNode = malloc(sizeof(struct node));\n" +
            "  newNode -> data = value;\n" +
            "  newNode -> left = NULL;\n" +
            "  newNode -> right = NULL;\n" +
            "\n" +
            "  return newNode;\n" +
            "}\n" +
            "\n" +
            "struct node* insert(struct node* root, int data)\n" +
            "{\n" +
            "  if (root == NULL) \n" +
            "    return createNode(data);\n" +
            "\n" +
            "  if (data  <  root -> data)\n" +
            "    root -> left  = insert(root -> left, data);\n" +
            "  else if (data > root -> data)\n" +
            "    root -> right = insert(root -> right, data);\n" +
            "\n" +
            "  return root;\n" +
            "}\n" +
            "\n" +
            "void inorder(struct node* root){\n" +
            "  if (root == NULL) return;\n" +
            "  inorder(root -> left);\n" +
            "  printf(\"%d ->\", root -> data);\n" +
            "  inorder(root -> right);\n" +
            "}\n" +
            "\n" +
            "\n" +
            "int main(){\n" +
            "  struct node *root = NULL;\n" +
            "  root = insert(root, 8);\n" +
            "  insert(root, 4);\n" +
            "  insert(root, 6);\n" +
            "  insert(root, 3);\n" +
            "  insert(root, 32);\n" +
            "  insert(root, 13);\n" +
            "  insert(root, 16);\n" +
            "  insert(root, 2);\n" +
            "\n" +
            "  inorder(root);\n" +
            "}  \n";
    //aVL
    public final String BF = "Balance Factor = height(left_subtree) − height(right_subtree)";

}
