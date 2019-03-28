package pattern.structural.bridge;

/**
 * Linux操作系统实现类：具体实现类
 *
 * @author wudih
 * @date 2019/3/28 11:09
 * @since master
 */
public class LinuxImpl implements ImageImpl {

    @Override
    public void doPaint(Matrix m) {
        // 调用Linux系统的绘制函数绘制像素矩阵
        System.out.print("在Linux操作系统中显示图像：");
    }
}
