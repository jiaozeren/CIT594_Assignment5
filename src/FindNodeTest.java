//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindNodeTest {
    protected BinarySearchTree<String> tree;

    public FindNodeTest() {
    }

    @Before
    public void setUp() throws Exception {
        this.tree = new BinarySearchTree();
        this.tree.add("dog");
        this.tree.add("cat");
        this.tree.add("pig");
    }

    @Test
    public void testTargetIsRoot() {
        try {
            BinarySearchTree.Node var1 = this.tree.findNode("dog");
            if (var1 == null) {
                Assert.fail("BinarySearchTree.findNode returned null when looking for value that is root");
            }

            Assert.assertEquals("BinarySearchTree.findNode returned incorrect Node when looking for value that is root", "dog", var1.value);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.findNode throws exception when target is root: " + var2);
        }

    }

    @Test
    public void testTargetIsLeftChildOfRoot() {
        try {
            BinarySearchTree.Node var1 = this.tree.findNode("cat");
            if (var1 == null) {
                Assert.fail("BinarySearchTree.findNode returned null when looking for value that is left child of root");
            }

            Assert.assertEquals("BinarySearchTree.findNode returned incorrect Node when looking for value that is left child of root", "cat", var1.value);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.findNode throws exception when target is left child of root: " + var2);
        }

    }

    @Test
    public void testTargetIsRightChildOfRoot() {
        try {
            BinarySearchTree.Node var1 = this.tree.findNode("pig");
            if (var1 == null) {
                Assert.fail("BinarySearchTree.findNode returned null when looking for value that is right child of root");
            }

            Assert.assertEquals("BinarySearchTree.findNode returned incorrect Node when looking for value that is right child of root", "pig", var1.value);
        } catch (Exception var2) {
            Assert.fail("BinarySearchTree.findNode throws exception when target is right child of root: " + var2);
        }

    }
}