What is the Composite Pattern?
A structural pattern that allows you to compose objects into tree-like structures to represent part-whole hierarchies. 
Clients can treat individual objects and groups of objects the same way.

Key Idea:
A "leaf" and a "composite" (a group of leaves or other composites) both implement the same interface.

Components:
Component – Interface for both leaf and composite objects.
Leaf – Single object; does the actual work.
Composite – Has children (which can be leaves or other composites).

Use the Composite Pattern when:
1. You need to represent a part-whole hierarchy.
   E.g., File system → Files and folders
   E.g., Organization → Employee and Manager (who has subordinates)
2. Clients should treat individual objects and groups of objects uniformly.
   You want to call the same method (.draw(), .render(), .ls(), etc.) on both leaf and composite 
   without caring which one it is.
3. You want to build a tree structure where each node is either:
   A leaf (no children)
   A composite (contains children of the same type)
4. You want recursive behavior.
   Composite can contain other composites, allowing recursion (e.g., directory.ls() calls ls() 
   on each child, which may be another directory or a file).

Mnemonic:
“When ‘container’ and ‘contained’ should look the same to the client.”

When not to use:
1. When the tree structure is flat or you don’t need recursive nesting.
2. When individual and group behavior diverge heavily (i.e., their operations differ a lot).
3. When performance is critical, and uniform treatment adds unnecessary abstraction.
