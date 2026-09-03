import java.io*;
interface Mystack
{
public void pop();
public void push();
public void display();
}
class Stack_array implements Mystack
{
final static int n=5;
int stack[]=new int[n];
int top=-1;
public void push()
{
try
{
BufferedReader br=new BufferedReader(new InputStreamReader(system.in);
if(top==(n-1))
