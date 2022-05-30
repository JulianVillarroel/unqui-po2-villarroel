package tp08CompositeShapeShifter;

import java.util.List;

public interface IShapeShifter {

	public IShapeShifter compose(IShapeShifter shape);

	public Integer deepest();

	public IShapeShifter flat();

	public List<Integer> values();
}
