import java.util.ArrayDeque;
import java.util.Deque;

public class AsteroidCollision735_Stack {
    public static int[] solution(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int ast: asteroids) {
        	if (ast > 0) {
        		stack.push(ast);
        	} else {
        		while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() <- ast) {
        			stack.pop();
        		}
        		if (!stack.isEmpty() && stack.peek() == -ast) {
        			stack.pop();
        		} else if (stack.isEmpty() || stack.peek() < 0) {
        			stack.push(ast);
        		}
        	}
        }
        
        int[] res = new int [stack.size()];
        for (int i = res.length - 1; i >= 0; i--) {
        	res[i] = stack.pop();
        }
        for (int i : res) {
        	System.out.println(i);	
        }
        return res;
    }
    
	public static void main(String[] args) {
		int [] asteroids = {11, 8, 2, -5, -8, 3};
		solution(asteroids);
	}
}
