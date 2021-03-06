package cn.dbdj1201.common.constant;

/**
 * <p>Title: ProductConstant</p>
 * Description：给销售属性用来区分保存与修改  根据情况看是否需要保存关联属性
 * date：2020/6/2 23:45
 */
public class ProductConstant {

    public enum AttrEnum {
        //销售属性
        ATTR_TYPE_BASE(1, "基本属性"), ATTR_TYPE_SALE(0, "销售属性");

        private final int code;

        private final String msg;

        AttrEnum(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public int getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }
    }
}
