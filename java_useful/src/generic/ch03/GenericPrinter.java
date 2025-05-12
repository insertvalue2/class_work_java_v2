package generic.ch03;

/**
 * 제네릭 프로그래밍을 사용하자 <T> --> 다음 단계 <T extends Object>
 * Material 를 상속받은 작식 클래스만 대체 문자열에 들어올 수 있다.
 */
public class GenericPrinter<T extends Material> {

    T material;

    // get,set
    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return material.toString();
    }

}
