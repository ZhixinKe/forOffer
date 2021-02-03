offer26

解题思路：

1. B如果是A的子结构，B的根节点必然是A的某个节点
2. 匹配子树是否相同

算法过程：
### 递归
```
boolean recr(TreeNode A, TreeNode B)
```
#### 递归必须要有的终止条件

1. B == null,说明B树已经遍历完成，因此返回true
2. A== null,说明已经越过树 A 叶子节点，即匹配失败，返回 false ；
3. A.val ! = B.val,结点不匹配，返回false。

#### 返回值
1. 判断 A 和 B 的左子节点是否相等，即 recur(A.left, B.left) ；
2. 判断 A 和 B 的右子节点是否相等，即 recur(A.rgiht, B.right) ；

### 判断节点
```
public boolean isSubStructure(TreeNode A, TreeNode B) {...}
```

####  1. 特例处理
- (A ==  null)  || (B==null)直接返回false

#### 2.  返回值
- 如果A.val == B.val，说明根节点相同，直接返回recr(A,B)
- 如果不等，可能B在A的子树结构中，返回isSubStructure(A.left,B) 或者 isSubStructure(A.right,B)
